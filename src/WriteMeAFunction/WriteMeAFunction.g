grammar WriteMeAFunction;

// We are redefining programs to be zero or more define declarations 
// followed by an optional expression.
program returns [Program ast]
    locals [ArrayList<DefineDecl> defs, ArrayList<Exp> exprs]
    @init { 
        $defs = new ArrayList<DefineDecl>(); 
        $exprs = new ArrayList<Exp>();
    } :
    (def=definedecl { $defs.add($def.ast); })*
    (e=exp { $exprs.add($e.ast); })+ // ← use + to allow multiple exps
    {
        $ast = new Program($defs, new BlockExp($exprs));
    }
;

// New declaration for global definitions.
definedecl returns [DefineDecl ast] :
    'Can you make' id=Identifier '=' e=exp
    { $ast = new DefineDecl($id.text, $e.ast); }
    ;
 
 exp returns [Exp ast]:
        '(' e=exp ')' { $ast = $e.ast; }
        | stat=definedecl {$ast = $stat.ast;} 
        | assign=assignment {$ast = $assign.ast;}
        | v=varexp { $ast = $v.ast; }
        | n=numexp { $ast = $n.ast; }
        | in=infixaddsubt { $ast = $in.ast;}
        | inm=infixmuldiv { $ast = $inm.ast;}
        | inp = infixpower { $ast = $inp.ast; }
        | p=printexp { $ast = $p.ast; }
        | r=randexp { $ast = $r.ast; }
        | i=ifexp { $ast = $i.ast; }
        | wh=whileexp { $ast = $wh.ast; }
        | b=block { $ast = $b.ast; }
        | eq=enterexp { $ast = $eq.ast; }
        | be=boolexp { $ast = $be.ast; }
        | fd=functiondef { $ast = $fd.ast; }
        | fc=functioncall { $ast = $fc.ast; }
        ;

assignment returns [Exp ast]:
    'Can you make' id=Identifier '=' e=exp
    { $ast = new AssignExp($id.text, $e.ast); }
    ;

numexp returns [NumExp ast]:
 		n0=Number { $ast = new NumExp(Integer.parseInt($n0.text)); } 
  		| '-' n0=Number { $ast = new NumExp(-Integer.parseInt($n0.text)); }
  		| n0=Number Dot n1=Number { $ast = new NumExp(Double.parseDouble($n0.text+"."+$n1.text)); }
  		| '-' n0=Number Dot n1=Number { $ast = new NumExp(Double.parseDouble("-" + $n0.text+"."+$n1.text)); }
  		;		

// COPIED FROM INFIX
infixaddsubt returns [Exp ast]
    @init { $ast = null; ArrayList<Exp> list = new ArrayList<Exp>(); }
    :
    l=infixmuldiv { $ast = $l.ast; }
    (('+' r=infixmuldiv { 
                          list = new ArrayList<Exp>();
                          list.add($ast);
                          list.add($r.ast);
                          $ast = new AddExp(list);
                        })
    | ('#' r=infixmuldiv { 
                          list = new ArrayList<Exp>();
                          list.add($ast);
                          list.add($r.ast);
                          $ast = new SubExp(list);
                        })
    )*
    ;

// Multiplication and Division - Higher Precedence than Addition
infixmuldiv returns [Exp ast]
    @init { $ast = null; ArrayList<Exp> list = new ArrayList<Exp>(); }
    :
    l=infixpower { $ast = $l.ast; } 
    (('*' r=infixpower { 
                     list = new ArrayList<Exp>();
                     list.add($ast);
                     list.add($r.ast);
                     $ast = new MultExp(list);
                   }) 
    | ('/' r=infixpower { 
                     list = new ArrayList<Exp>();
                     list.add($ast);
                     list.add($r.ast);
                     $ast = new DivExp(list);
                   })
    )*
    ;

// Exponentiation - Highest Precedence and Right-Associative
infixpower returns [Exp ast]
    :
    l=atom { $ast = $l.ast; }
    ('^' exponent=infixpower {  // Right-associative exponentiation
                          ArrayList<Exp> list = new ArrayList<Exp>();
                          list.add($ast);
                          list.add($exponent.ast);
                          $ast = new PowExp(list);
                        }
    )*
    ;

atom returns [Exp ast]
    : id=Identifier { $ast = new VarExp($id.text); }          // Variable case (like `a`, `b`)
    | n=numexp { $ast = $n.ast; }                            // Numeric case (like `3`, `-5`)
    | r=randexp { $ast = $r.ast; }                          // Roll case
    ;

// COPIED FROM INFIX
varexp returns [Exp ast] : 
    id=Identifier { $ast = new VarExp($id.text); }          // Variable case (like `a`, `b`)
    | n=numexp { $ast = $n.ast; }                            // Numeric case (like `3`, `-5`)
    ;


printexp returns [Exp ast]
@init {
    List<Exp> parts = new ArrayList<Exp>();
}
    : 'Tell them ' 
      (
          (s=STRING {
              String raw = $s.text;
              parts.add(new StrLitExp(raw.substring(1, raw.length() - 1)));
          }
          | e=exp { parts.add($e.ast); }
          )
      )+ 
      {
          $ast = new PrintExp(parts);
      }
      '?'
    ;

    randexp returns [Exp ast]
    : 'RAND' { $ast = new RandExp(); }
    ;

enterexp returns [Exp ast]
    : 'Ask them' id=Identifier { $ast = new EnterQuestExp($id.text); }
    ;

boolexp returns [Exp ast]
    : l=term rest=boolexp_rest[$l.ast] { $ast = $rest.ast; }
    ;

boolexp_rest[Exp left] returns [Exp ast]
    : '&&' r=term {
        ArrayList<Exp> list = new ArrayList<Exp>();
        list.add($left);
        list.add($r.ast);
        Exp and = new AndExp(list);
    } rest=boolexp_rest[and] { $ast = $rest.ast; }
    | '||' r=term {
        ArrayList<Exp> list = new ArrayList<Exp>();
        list.add($left);
        list.add($r.ast);
        Exp or = new OrExp(list);
    } rest=boolexp_rest[or] { $ast = $rest.ast; }
    | /* epsilon */ { $ast = $left; }
    ;

term returns [Exp ast]
    : l=infixaddsubt op=('>' | '<' | '>=' | '<=' | '==' | '!=') r=infixaddsubt {
        $ast = new CompareExp($l.ast, $r.ast, $op.text);
    }
    | e=infixaddsubt { $ast = $e.ast; }
    ;

ifexp returns [Exp ast]
    : 'Will it ' cond=boolexp '?' '{' stmts+=exp+ '}' {
        List<Exp> expressions = new ArrayList<>();
        for (ExpContext expCtx : $stmts) {
            expressions.add(expCtx.ast);  // Add each inner expression
        }
        $ast = new IfExp($cond.ast, new BlockExp(expressions));
    }
    ;
whileexp returns [Exp ast]
    : 'Can you do until' '(' cond=boolexp ')' '{' stmts+=exp+ '}' {
        List<Exp> expressions = new ArrayList<>();
        for (ExpContext expCtx : $stmts) {
            expressions.add(expCtx.ast);  // Add the AST of each statement
        }
        $ast = new WhileExp($cond.ast, new BlockExp(expressions));
    }
;
block returns [Exp ast]
    : '{' exps+=exp+ '}' {  // ← directly allow blocks inside exp
        List<Exp> exprs = new ArrayList<>();
        for (ExpContext e : $exps) {
            exprs.add(e.ast);
        }
        $ast = new BlockExp(exprs);
    }
    ;

functiondef returns [Exp ast]:
    'Write me a function called' id=Identifier '{' exps+=exp+ '}' {
        List<Exp> exprs = new ArrayList<>();
        for (ExpContext e : $exps) {
            exprs.add(e.ast);
        }
        $ast = new FunctionDef($id.text, new BlockExp(exprs));
    }
    ;

functioncall returns [Exp ast]:
    'Can it' id=Identifier '?'
    { $ast = new FunctionCall($id.text); }
    ;

// Lexical Specification of this Programming Language
//  - lexical specification rules start with uppercase
 
 Define : 'Can you make' ;
 Print : 'Tell them';
 Rand : 'RAND';
 Let : 'let' ;
 Dot : '.' ;
ASK : 'Ask them';


 Number : DIGIT+ ;

 Identifier :   Letter LetterOrDigit*;

 Letter :   [a-zA-Z$_]
	|   ~[\u0000-\u00FF\uD800-\uDBFF] 
		{Character.isJavaIdentifierStart(_input.LA(-1))}?
	|   [\uD800-\uDBFF] [\uDC00-\uDFFF] 
		{Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}? ;

 LetterOrDigit: [a-zA-Z0-9$_]
	|   ~[\u0000-\u00FF\uD800-\uDBFF] 
		{Character.isJavaIdentifierPart(_input.LA(-1))}?
	|    [\uD800-\uDBFF] [\uDC00-\uDFFF] 
		{Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?;

 fragment DIGIT: ('0'..'9');

 AT : '@';
 ELLIPSIS : '...';
 WS  :  [ \t\r\n\u000C]+ -> skip;
 Comment :   '/*' .*? '*/' -> skip;
 Line_Comment :   '//' ~[\r\n]* -> skip;
 STRING : '"' (~["\\] | '\\' .)* '"' ;
 