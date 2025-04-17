// Generated from WriteMeAFunction.g by ANTLR 4.5
package WriteMeAFunction.parser; import static WriteMeAFunction.AST.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WriteMeAFunctionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, Define=26, Print=27, Rand=28, Let=29, Dot=30, ASK=31, Number=32, 
		Identifier=33, Letter=34, LetterOrDigit=35, AT=36, ELLIPSIS=37, WS=38, 
		Comment=39, Line_Comment=40, STRING=41;
	public static final int
		RULE_program = 0, RULE_definedecl = 1, RULE_exp = 2, RULE_assignment = 3, 
		RULE_numexp = 4, RULE_infixaddsubt = 5, RULE_infixmuldiv = 6, RULE_infixpower = 7, 
		RULE_atom = 8, RULE_varexp = 9, RULE_printexp = 10, RULE_randexp = 11, 
		RULE_enterexp = 12, RULE_boolexp = 13, RULE_boolexp_rest = 14, RULE_term = 15, 
		RULE_ifexp = 16, RULE_whileexp = 17, RULE_block = 18, RULE_functiondef = 19, 
		RULE_functioncall = 20;
	public static final String[] ruleNames = {
		"program", "definedecl", "exp", "assignment", "numexp", "infixaddsubt", 
		"infixmuldiv", "infixpower", "atom", "varexp", "printexp", "randexp", 
		"enterexp", "boolexp", "boolexp_rest", "term", "ifexp", "whileexp", "block", 
		"functiondef", "functioncall"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "')'", "'-'", "'+'", "'#'", "'*'", "'/'", "'^'", "'Tell them '", 
		"'?'", "'&&'", "'||'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'Will it '", 
		"'{'", "'}'", "'Can you do until'", "'Write me a function called'", "'Can it'", 
		"'Can you make'", "'Tell them'", "'RAND'", "'let'", "'.'", "'Ask them'", 
		null, null, null, null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "Define", "Print", "Rand", "Let", "Dot", "ASK", "Number", 
		"Identifier", "Letter", "LetterOrDigit", "AT", "ELLIPSIS", "WS", "Comment", 
		"Line_Comment", "STRING"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "WriteMeAFunction.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WriteMeAFunctionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public ArrayList<DefineDecl> defs;
		public ArrayList<Exp> exprs;
		public DefinedeclContext def;
		public ExpContext e;
		public List<DefinedeclContext> definedecl() {
			return getRuleContexts(DefinedeclContext.class);
		}
		public DefinedeclContext definedecl(int i) {
			return getRuleContext(DefinedeclContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		 
		        ((ProgramContext)_localctx).defs =  new ArrayList<DefineDecl>(); 
		        ((ProgramContext)_localctx).exprs =  new ArrayList<Exp>();
		    
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(42);
					((ProgramContext)_localctx).def = definedecl();
					 _localctx.defs.add(((ProgramContext)_localctx).def.ast); 
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				((ProgramContext)_localctx).e = exp();
				 _localctx.exprs.add(((ProgramContext)_localctx).e.ast); 
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__9) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << Define) | (1L << Rand) | (1L << ASK) | (1L << Number) | (1L << Identifier))) != 0) );

			        ((ProgramContext)_localctx).ast =  new Program(_localctx.defs, new BlockExp(_localctx.exprs));
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinedeclContext extends ParserRuleContext {
		public DefineDecl ast;
		public Token id;
		public ExpContext e;
		public TerminalNode Identifier() { return getToken(WriteMeAFunctionParser.Identifier, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DefinedeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definedecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).enterDefinedecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).exitDefinedecl(this);
		}
	}

	public final DefinedeclContext definedecl() throws RecognitionException {
		DefinedeclContext _localctx = new DefinedeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definedecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(Define);
			setState(60);
			((DefinedeclContext)_localctx).id = match(Identifier);
			setState(61);
			match(T__0);
			setState(62);
			((DefinedeclContext)_localctx).e = exp();
			 ((DefinedeclContext)_localctx).ast =  new DefineDecl((((DefinedeclContext)_localctx).id!=null?((DefinedeclContext)_localctx).id.getText():null), ((DefinedeclContext)_localctx).e.ast); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public Exp ast;
		public ExpContext e;
		public DefinedeclContext stat;
		public AssignmentContext assign;
		public VarexpContext v;
		public NumexpContext n;
		public InfixaddsubtContext in;
		public InfixmuldivContext inm;
		public InfixpowerContext inp;
		public PrintexpContext p;
		public RandexpContext r;
		public IfexpContext i;
		public WhileexpContext wh;
		public BlockContext b;
		public EnterexpContext eq;
		public BoolexpContext be;
		public FunctiondefContext fd;
		public FunctioncallContext fc;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DefinedeclContext definedecl() {
			return getRuleContext(DefinedeclContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public VarexpContext varexp() {
			return getRuleContext(VarexpContext.class,0);
		}
		public NumexpContext numexp() {
			return getRuleContext(NumexpContext.class,0);
		}
		public InfixaddsubtContext infixaddsubt() {
			return getRuleContext(InfixaddsubtContext.class,0);
		}
		public InfixmuldivContext infixmuldiv() {
			return getRuleContext(InfixmuldivContext.class,0);
		}
		public InfixpowerContext infixpower() {
			return getRuleContext(InfixpowerContext.class,0);
		}
		public PrintexpContext printexp() {
			return getRuleContext(PrintexpContext.class,0);
		}
		public RandexpContext randexp() {
			return getRuleContext(RandexpContext.class,0);
		}
		public IfexpContext ifexp() {
			return getRuleContext(IfexpContext.class,0);
		}
		public WhileexpContext whileexp() {
			return getRuleContext(WhileexpContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EnterexpContext enterexp() {
			return getRuleContext(EnterexpContext.class,0);
		}
		public BoolexpContext boolexp() {
			return getRuleContext(BoolexpContext.class,0);
		}
		public FunctiondefContext functiondef() {
			return getRuleContext(FunctiondefContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exp);
		try {
			setState(118);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(T__1);
				setState(66);
				((ExpContext)_localctx).e = exp();
				setState(67);
				match(T__2);
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).e.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				((ExpContext)_localctx).stat = definedecl();
				((ExpContext)_localctx).ast =  ((ExpContext)_localctx).stat.ast;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				((ExpContext)_localctx).assign = assignment();
				((ExpContext)_localctx).ast =  ((ExpContext)_localctx).assign.ast;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				((ExpContext)_localctx).v = varexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).v.ast; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				((ExpContext)_localctx).n = numexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).n.ast; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(82);
				((ExpContext)_localctx).in = infixaddsubt();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).in.ast;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(85);
				((ExpContext)_localctx).inm = infixmuldiv();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).inm.ast;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(88);
				((ExpContext)_localctx).inp = infixpower();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).inp.ast; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(91);
				((ExpContext)_localctx).p = printexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).p.ast; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(94);
				((ExpContext)_localctx).r = randexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).r.ast; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(97);
				((ExpContext)_localctx).i = ifexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).i.ast; 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(100);
				((ExpContext)_localctx).wh = whileexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).wh.ast; 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(103);
				((ExpContext)_localctx).b = block();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).b.ast; 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(106);
				((ExpContext)_localctx).eq = enterexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).eq.ast; 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(109);
				((ExpContext)_localctx).be = boolexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).be.ast; 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(112);
				((ExpContext)_localctx).fd = functiondef();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).fd.ast; 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(115);
				((ExpContext)_localctx).fc = functioncall();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).fc.ast; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public Exp ast;
		public Token id;
		public ExpContext e;
		public TerminalNode Identifier() { return getToken(WriteMeAFunctionParser.Identifier, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(Define);
			setState(121);
			((AssignmentContext)_localctx).id = match(Identifier);
			setState(122);
			match(T__0);
			setState(123);
			((AssignmentContext)_localctx).e = exp();
			 ((AssignmentContext)_localctx).ast =  new AssignExp((((AssignmentContext)_localctx).id!=null?((AssignmentContext)_localctx).id.getText():null), ((AssignmentContext)_localctx).e.ast); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumexpContext extends ParserRuleContext {
		public NumExp ast;
		public Token n0;
		public Token n1;
		public List<TerminalNode> Number() { return getTokens(WriteMeAFunctionParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(WriteMeAFunctionParser.Number, i);
		}
		public TerminalNode Dot() { return getToken(WriteMeAFunctionParser.Dot, 0); }
		public NumexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).enterNumexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).exitNumexp(this);
		}
	}

	public final NumexpContext numexp() throws RecognitionException {
		NumexpContext _localctx = new NumexpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_numexp);
		try {
			setState(140);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				((NumexpContext)_localctx).n0 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Integer.parseInt((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null))); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(T__3);
				setState(129);
				((NumexpContext)_localctx).n0 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(-Integer.parseInt((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null))); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				((NumexpContext)_localctx).n0 = match(Number);
				setState(132);
				match(Dot);
				setState(133);
				((NumexpContext)_localctx).n1 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Double.parseDouble((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null)+"."+(((NumexpContext)_localctx).n1!=null?((NumexpContext)_localctx).n1.getText():null))); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				match(T__3);
				setState(136);
				((NumexpContext)_localctx).n0 = match(Number);
				setState(137);
				match(Dot);
				setState(138);
				((NumexpContext)_localctx).n1 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Double.parseDouble("-" + (((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null)+"."+(((NumexpContext)_localctx).n1!=null?((NumexpContext)_localctx).n1.getText():null))); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InfixaddsubtContext extends ParserRuleContext {
		public Exp ast;
		public InfixmuldivContext l;
		public InfixmuldivContext r;
		public List<InfixmuldivContext> infixmuldiv() {
			return getRuleContexts(InfixmuldivContext.class);
		}
		public InfixmuldivContext infixmuldiv(int i) {
			return getRuleContext(InfixmuldivContext.class,i);
		}
		public InfixaddsubtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixaddsubt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).enterInfixaddsubt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).exitInfixaddsubt(this);
		}
	}

	public final InfixaddsubtContext infixaddsubt() throws RecognitionException {
		InfixaddsubtContext _localctx = new InfixaddsubtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_infixaddsubt);
		 ((InfixaddsubtContext)_localctx).ast =  null; ArrayList<Exp> list = new ArrayList<Exp>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			((InfixaddsubtContext)_localctx).l = infixmuldiv();
			 ((InfixaddsubtContext)_localctx).ast =  ((InfixaddsubtContext)_localctx).l.ast; 
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4 || _la==T__5) {
				{
				setState(152);
				switch (_input.LA(1)) {
				case T__4:
					{
					{
					setState(144);
					match(T__4);
					setState(145);
					((InfixaddsubtContext)_localctx).r = infixmuldiv();
					 
					                          list = new ArrayList<Exp>();
					                          list.add(_localctx.ast);
					                          list.add(((InfixaddsubtContext)_localctx).r.ast);
					                          ((InfixaddsubtContext)_localctx).ast =  new AddExp(list);
					                        
					}
					}
					break;
				case T__5:
					{
					{
					setState(148);
					match(T__5);
					setState(149);
					((InfixaddsubtContext)_localctx).r = infixmuldiv();
					 
					                          list = new ArrayList<Exp>();
					                          list.add(_localctx.ast);
					                          list.add(((InfixaddsubtContext)_localctx).r.ast);
					                          ((InfixaddsubtContext)_localctx).ast =  new SubExp(list);
					                        
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InfixmuldivContext extends ParserRuleContext {
		public Exp ast;
		public InfixpowerContext l;
		public InfixpowerContext r;
		public List<InfixpowerContext> infixpower() {
			return getRuleContexts(InfixpowerContext.class);
		}
		public InfixpowerContext infixpower(int i) {
			return getRuleContext(InfixpowerContext.class,i);
		}
		public InfixmuldivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixmuldiv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).enterInfixmuldiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).exitInfixmuldiv(this);
		}
	}

	public final InfixmuldivContext infixmuldiv() throws RecognitionException {
		InfixmuldivContext _localctx = new InfixmuldivContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_infixmuldiv);
		 ((InfixmuldivContext)_localctx).ast =  null; ArrayList<Exp> list = new ArrayList<Exp>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			((InfixmuldivContext)_localctx).l = infixpower();
			 ((InfixmuldivContext)_localctx).ast =  ((InfixmuldivContext)_localctx).l.ast; 
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==T__7) {
				{
				setState(167);
				switch (_input.LA(1)) {
				case T__6:
					{
					{
					setState(159);
					match(T__6);
					setState(160);
					((InfixmuldivContext)_localctx).r = infixpower();
					 
					                     list = new ArrayList<Exp>();
					                     list.add(_localctx.ast);
					                     list.add(((InfixmuldivContext)_localctx).r.ast);
					                     ((InfixmuldivContext)_localctx).ast =  new MultExp(list);
					                   
					}
					}
					break;
				case T__7:
					{
					{
					setState(163);
					match(T__7);
					setState(164);
					((InfixmuldivContext)_localctx).r = infixpower();
					 
					                     list = new ArrayList<Exp>();
					                     list.add(_localctx.ast);
					                     list.add(((InfixmuldivContext)_localctx).r.ast);
					                     ((InfixmuldivContext)_localctx).ast =  new DivExp(list);
					                   
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InfixpowerContext extends ParserRuleContext {
		public Exp ast;
		public AtomContext l;
		public InfixpowerContext exponent;
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<InfixpowerContext> infixpower() {
			return getRuleContexts(InfixpowerContext.class);
		}
		public InfixpowerContext infixpower(int i) {
			return getRuleContext(InfixpowerContext.class,i);
		}
		public InfixpowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixpower; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).enterInfixpower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).exitInfixpower(this);
		}
	}

	public final InfixpowerContext infixpower() throws RecognitionException {
		InfixpowerContext _localctx = new InfixpowerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_infixpower);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			((InfixpowerContext)_localctx).l = atom();
			 ((InfixpowerContext)_localctx).ast =  ((InfixpowerContext)_localctx).l.ast; 
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(174);
					match(T__8);
					setState(175);
					((InfixpowerContext)_localctx).exponent = infixpower();
					  // Right-associative exponentiation
					                          ArrayList<Exp> list = new ArrayList<Exp>();
					                          list.add(_localctx.ast);
					                          list.add(((InfixpowerContext)_localctx).exponent.ast);
					                          ((InfixpowerContext)_localctx).ast =  new PowExp(list);
					                        
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public Exp ast;
		public Token id;
		public NumexpContext n;
		public RandexpContext r;
		public TerminalNode Identifier() { return getToken(WriteMeAFunctionParser.Identifier, 0); }
		public NumexpContext numexp() {
			return getRuleContext(NumexpContext.class,0);
		}
		public RandexpContext randexp() {
			return getRuleContext(RandexpContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atom);
		try {
			setState(191);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				((AtomContext)_localctx).id = match(Identifier);
				 ((AtomContext)_localctx).ast =  new VarExp((((AtomContext)_localctx).id!=null?((AtomContext)_localctx).id.getText():null)); 
				}
				break;
			case T__3:
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				((AtomContext)_localctx).n = numexp();
				 ((AtomContext)_localctx).ast =  ((AtomContext)_localctx).n.ast; 
				}
				break;
			case Rand:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				((AtomContext)_localctx).r = randexp();
				 ((AtomContext)_localctx).ast =  ((AtomContext)_localctx).r.ast; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarexpContext extends ParserRuleContext {
		public Exp ast;
		public Token id;
		public NumexpContext n;
		public TerminalNode Identifier() { return getToken(WriteMeAFunctionParser.Identifier, 0); }
		public NumexpContext numexp() {
			return getRuleContext(NumexpContext.class,0);
		}
		public VarexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).enterVarexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).exitVarexp(this);
		}
	}

	public final VarexpContext varexp() throws RecognitionException {
		VarexpContext _localctx = new VarexpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varexp);
		try {
			setState(198);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				((VarexpContext)_localctx).id = match(Identifier);
				 ((VarexpContext)_localctx).ast =  new VarExp((((VarexpContext)_localctx).id!=null?((VarexpContext)_localctx).id.getText():null)); 
				}
				break;
			case T__3:
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				((VarexpContext)_localctx).n = numexp();
				 ((VarexpContext)_localctx).ast =  ((VarexpContext)_localctx).n.ast; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintexpContext extends ParserRuleContext {
		public Exp ast;
		public Token s;
		public ExpContext e;
		public List<TerminalNode> STRING() { return getTokens(WriteMeAFunctionParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(WriteMeAFunctionParser.STRING, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public PrintexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).enterPrintexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).exitPrintexp(this);
		}
	}

	public final PrintexpContext printexp() throws RecognitionException {
		PrintexpContext _localctx = new PrintexpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_printexp);

		    List<Exp> parts = new ArrayList<Exp>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__9);
			setState(208); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(206);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(201);
					((PrintexpContext)_localctx).s = match(STRING);

					              String raw = (((PrintexpContext)_localctx).s!=null?((PrintexpContext)_localctx).s.getText():null);
					              parts.add(new StrLitExp(raw.substring(1, raw.length() - 1)));
					          
					}
					break;
				case T__1:
				case T__3:
				case T__9:
				case T__19:
				case T__20:
				case T__22:
				case T__23:
				case T__24:
				case Define:
				case Rand:
				case ASK:
				case Number:
				case Identifier:
					{
					setState(203);
					((PrintexpContext)_localctx).e = exp();
					 parts.add(((PrintexpContext)_localctx).e.ast); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__9) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << Define) | (1L << Rand) | (1L << ASK) | (1L << Number) | (1L << Identifier) | (1L << STRING))) != 0) );

			          ((PrintexpContext)_localctx).ast =  new PrintExp(parts);
			      
			setState(213);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RandexpContext extends ParserRuleContext {
		public Exp ast;
		public RandexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_randexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).enterRandexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).exitRandexp(this);
		}
	}

	public final RandexpContext randexp() throws RecognitionException {
		RandexpContext _localctx = new RandexpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_randexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(Rand);
			 ((RandexpContext)_localctx).ast =  new RandExp(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnterexpContext extends ParserRuleContext {
		public Exp ast;
		public Token id;
		public TerminalNode Identifier() { return getToken(WriteMeAFunctionParser.Identifier, 0); }
		public EnterexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enterexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).enterEnterexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).exitEnterexp(this);
		}
	}

	public final EnterexpContext enterexp() throws RecognitionException {
		EnterexpContext _localctx = new EnterexpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enterexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(ASK);
			setState(219);
			((EnterexpContext)_localctx).id = match(Identifier);
			((EnterexpContext)_localctx).ast =  new AskThemExp((((EnterexpContext)_localctx).id!=null?((EnterexpContext)_localctx).id.getText():null)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolexpContext extends ParserRuleContext {
		public Exp ast;
		public TermContext l;
		public Boolexp_restContext rest;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Boolexp_restContext boolexp_rest() {
			return getRuleContext(Boolexp_restContext.class,0);
		}
		public BoolexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).enterBoolexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).exitBoolexp(this);
		}
	}

	public final BoolexpContext boolexp() throws RecognitionException {
		BoolexpContext _localctx = new BoolexpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_boolexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			((BoolexpContext)_localctx).l = term();
			setState(223);
			((BoolexpContext)_localctx).rest = boolexp_rest(((BoolexpContext)_localctx).l.ast);
			 ((BoolexpContext)_localctx).ast =  ((BoolexpContext)_localctx).rest.ast; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolexp_restContext extends ParserRuleContext {
		public Exp left;
		public Exp ast;
		public TermContext r;
		public Boolexp_restContext rest;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Boolexp_restContext boolexp_rest() {
			return getRuleContext(Boolexp_restContext.class,0);
		}
		public Boolexp_restContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Boolexp_restContext(ParserRuleContext parent, int invokingState, Exp left) {
			super(parent, invokingState);
			this.left = left;
		}
		@Override public int getRuleIndex() { return RULE_boolexp_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).enterBoolexp_rest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).exitBoolexp_rest(this);
		}
	}

	public final Boolexp_restContext boolexp_rest(Exp left) throws RecognitionException {
		Boolexp_restContext _localctx = new Boolexp_restContext(_ctx, getState(), left);
		enterRule(_localctx, 28, RULE_boolexp_rest);
		try {
			setState(239);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(T__11);
				setState(227);
				((Boolexp_restContext)_localctx).r = term();

				        ArrayList<Exp> list = new ArrayList<Exp>();
				        list.add(_localctx.left);
				        list.add(((Boolexp_restContext)_localctx).r.ast);
				        Exp and = new AndExp(list);
				    
				setState(229);
				((Boolexp_restContext)_localctx).rest = boolexp_rest(and);
				 ((Boolexp_restContext)_localctx).ast =  ((Boolexp_restContext)_localctx).rest.ast; 
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(T__12);
				setState(233);
				((Boolexp_restContext)_localctx).r = term();

				        ArrayList<Exp> list = new ArrayList<Exp>();
				        list.add(_localctx.left);
				        list.add(((Boolexp_restContext)_localctx).r.ast);
				        Exp or = new OrExp(list);
				    
				setState(235);
				((Boolexp_restContext)_localctx).rest = boolexp_rest(or);
				 ((Boolexp_restContext)_localctx).ast =  ((Boolexp_restContext)_localctx).rest.ast; 
				}
				break;
			case EOF:
			case T__1:
			case T__2:
			case T__3:
			case T__9:
			case T__10:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case Define:
			case Rand:
			case ASK:
			case Number:
			case Identifier:
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				 ((Boolexp_restContext)_localctx).ast =  _localctx.left; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public Exp ast;
		public InfixaddsubtContext l;
		public Token op;
		public InfixaddsubtContext r;
		public InfixaddsubtContext e;
		public List<InfixaddsubtContext> infixaddsubt() {
			return getRuleContexts(InfixaddsubtContext.class);
		}
		public InfixaddsubtContext infixaddsubt(int i) {
			return getRuleContext(InfixaddsubtContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_term);
		int _la;
		try {
			setState(249);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				((TermContext)_localctx).l = infixaddsubt();
				setState(242);
				((TermContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
					((TermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(243);
				((TermContext)_localctx).r = infixaddsubt();

				        ((TermContext)_localctx).ast =  new CompareExp(((TermContext)_localctx).l.ast, ((TermContext)_localctx).r.ast, (((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getText():null));
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				((TermContext)_localctx).e = infixaddsubt();
				 ((TermContext)_localctx).ast =  ((TermContext)_localctx).e.ast; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfexpContext extends ParserRuleContext {
		public Exp ast;
		public BoolexpContext cond;
		public ExpContext exp;
		public List<ExpContext> stmts = new ArrayList<ExpContext>();
		public BoolexpContext boolexp() {
			return getRuleContext(BoolexpContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public IfexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).enterIfexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).exitIfexp(this);
		}
	}

	public final IfexpContext ifexp() throws RecognitionException {
		IfexpContext _localctx = new IfexpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(T__19);
			setState(252);
			((IfexpContext)_localctx).cond = boolexp();
			setState(253);
			match(T__10);
			setState(254);
			match(T__20);
			setState(256); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(255);
				((IfexpContext)_localctx).exp = exp();
				((IfexpContext)_localctx).stmts.add(((IfexpContext)_localctx).exp);
				}
				}
				setState(258); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__9) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << Define) | (1L << Rand) | (1L << ASK) | (1L << Number) | (1L << Identifier))) != 0) );
			setState(260);
			match(T__21);

			        List<Exp> expressions = new ArrayList<>();
			        for (ExpContext expCtx : ((IfexpContext)_localctx).stmts) {
			            expressions.add(expCtx.ast);  // Add each inner expression
			        }
			        ((IfexpContext)_localctx).ast =  new IfExp(((IfexpContext)_localctx).cond.ast, new BlockExp(expressions));
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileexpContext extends ParserRuleContext {
		public Exp ast;
		public BoolexpContext cond;
		public ExpContext exp;
		public List<ExpContext> stmts = new ArrayList<ExpContext>();
		public BoolexpContext boolexp() {
			return getRuleContext(BoolexpContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public WhileexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).enterWhileexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).exitWhileexp(this);
		}
	}

	public final WhileexpContext whileexp() throws RecognitionException {
		WhileexpContext _localctx = new WhileexpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whileexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__22);
			setState(264);
			match(T__1);
			setState(265);
			((WhileexpContext)_localctx).cond = boolexp();
			setState(266);
			match(T__2);
			setState(267);
			match(T__20);
			setState(269); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(268);
				((WhileexpContext)_localctx).exp = exp();
				((WhileexpContext)_localctx).stmts.add(((WhileexpContext)_localctx).exp);
				}
				}
				setState(271); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__9) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << Define) | (1L << Rand) | (1L << ASK) | (1L << Number) | (1L << Identifier))) != 0) );
			setState(273);
			match(T__21);

			        List<Exp> expressions = new ArrayList<>();
			        for (ExpContext expCtx : ((WhileexpContext)_localctx).stmts) {
			            expressions.add(expCtx.ast);  // Add the AST of each statement
			        }
			        ((WhileexpContext)_localctx).ast =  new WhileExp(((WhileexpContext)_localctx).cond.ast, new BlockExp(expressions));
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public Exp ast;
		public ExpContext exp;
		public List<ExpContext> exps = new ArrayList<ExpContext>();
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(T__20);
			setState(278); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(277);
				((BlockContext)_localctx).exp = exp();
				((BlockContext)_localctx).exps.add(((BlockContext)_localctx).exp);
				}
				}
				setState(280); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__9) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << Define) | (1L << Rand) | (1L << ASK) | (1L << Number) | (1L << Identifier))) != 0) );
			setState(282);
			match(T__21);
			  // ← directly allow blocks inside exp
			        List<Exp> exprs = new ArrayList<>();
			        for (ExpContext e : ((BlockContext)_localctx).exps) {
			            exprs.add(e.ast);
			        }
			        ((BlockContext)_localctx).ast =  new BlockExp(exprs);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctiondefContext extends ParserRuleContext {
		public Exp ast;
		public Token id;
		public ExpContext exp;
		public List<ExpContext> exps = new ArrayList<ExpContext>();
		public TerminalNode Identifier() { return getToken(WriteMeAFunctionParser.Identifier, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public FunctiondefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).enterFunctiondef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).exitFunctiondef(this);
		}
	}

	public final FunctiondefContext functiondef() throws RecognitionException {
		FunctiondefContext _localctx = new FunctiondefContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functiondef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(T__23);
			setState(286);
			((FunctiondefContext)_localctx).id = match(Identifier);
			setState(287);
			match(T__20);
			setState(289); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(288);
				((FunctiondefContext)_localctx).exp = exp();
				((FunctiondefContext)_localctx).exps.add(((FunctiondefContext)_localctx).exp);
				}
				}
				setState(291); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__9) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << Define) | (1L << Rand) | (1L << ASK) | (1L << Number) | (1L << Identifier))) != 0) );
			setState(293);
			match(T__21);

			        List<Exp> exprs = new ArrayList<>();
			        for (ExpContext e : ((FunctiondefContext)_localctx).exps) {
			            exprs.add(e.ast);
			        }
			        ((FunctiondefContext)_localctx).ast =  new FunctionDef((((FunctiondefContext)_localctx).id!=null?((FunctiondefContext)_localctx).id.getText():null), new BlockExp(exprs));
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctioncallContext extends ParserRuleContext {
		public Exp ast;
		public Token id;
		public TerminalNode Identifier() { return getToken(WriteMeAFunctionParser.Identifier, 0); }
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WriteMeAFunctionListener ) ((WriteMeAFunctionListener)listener).exitFunctioncall(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(T__24);
			setState(297);
			((FunctioncallContext)_localctx).id = match(Identifier);
			setState(298);
			match(T__10);
			 ((FunctioncallContext)_localctx).ast =  new FunctionCall((((FunctioncallContext)_localctx).id!=null?((FunctioncallContext)_localctx).id.getText():null)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u0130\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\7\2\60\n\2\f\2\16"+
		"\2\63\13\2\3\2\3\2\3\2\6\28\n\2\r\2\16\29\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4y\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u008f\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7\u009b\n\7\f\7\16\7\u009e\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\7\b\u00aa\n\b\f\b\16\b\u00ad\13\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\7\t\u00b5\n\t\f\t\16\t\u00b8\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u00c2\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u00c9\n\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u00d1\n\f\6\f\u00d3\n\f\r\f\16\f\u00d4\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f2\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00fc\n\21\3\22\3\22\3\22\3\22\3\22\6\22"+
		"\u0103\n\22\r\22\16\22\u0104\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\6\23\u0110\n\23\r\23\16\23\u0111\3\23\3\23\3\23\3\24\3\24\6\24\u0119"+
		"\n\24\r\24\16\24\u011a\3\24\3\24\3\24\3\25\3\25\3\25\3\25\6\25\u0124\n"+
		"\25\r\25\16\25\u0125\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\2\2"+
		"\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\3\3\2\20\25\u0140"+
		"\2\61\3\2\2\2\4=\3\2\2\2\6x\3\2\2\2\bz\3\2\2\2\n\u008e\3\2\2\2\f\u0090"+
		"\3\2\2\2\16\u009f\3\2\2\2\20\u00ae\3\2\2\2\22\u00c1\3\2\2\2\24\u00c8\3"+
		"\2\2\2\26\u00ca\3\2\2\2\30\u00d9\3\2\2\2\32\u00dc\3\2\2\2\34\u00e0\3\2"+
		"\2\2\36\u00f1\3\2\2\2 \u00fb\3\2\2\2\"\u00fd\3\2\2\2$\u0109\3\2\2\2&\u0116"+
		"\3\2\2\2(\u011f\3\2\2\2*\u012a\3\2\2\2,-\5\4\3\2-.\b\2\1\2.\60\3\2\2\2"+
		"/,\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\67\3\2\2\2\63\61"+
		"\3\2\2\2\64\65\5\6\4\2\65\66\b\2\1\2\668\3\2\2\2\67\64\3\2\2\289\3\2\2"+
		"\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\b\2\1\2<\3\3\2\2\2=>\7\34\2\2>?\7"+
		"#\2\2?@\7\3\2\2@A\5\6\4\2AB\b\3\1\2B\5\3\2\2\2CD\7\4\2\2DE\5\6\4\2EF\7"+
		"\5\2\2FG\b\4\1\2Gy\3\2\2\2HI\5\4\3\2IJ\b\4\1\2Jy\3\2\2\2KL\5\b\5\2LM\b"+
		"\4\1\2My\3\2\2\2NO\5\24\13\2OP\b\4\1\2Py\3\2\2\2QR\5\n\6\2RS\b\4\1\2S"+
		"y\3\2\2\2TU\5\f\7\2UV\b\4\1\2Vy\3\2\2\2WX\5\16\b\2XY\b\4\1\2Yy\3\2\2\2"+
		"Z[\5\20\t\2[\\\b\4\1\2\\y\3\2\2\2]^\5\26\f\2^_\b\4\1\2_y\3\2\2\2`a\5\30"+
		"\r\2ab\b\4\1\2by\3\2\2\2cd\5\"\22\2de\b\4\1\2ey\3\2\2\2fg\5$\23\2gh\b"+
		"\4\1\2hy\3\2\2\2ij\5&\24\2jk\b\4\1\2ky\3\2\2\2lm\5\32\16\2mn\b\4\1\2n"+
		"y\3\2\2\2op\5\34\17\2pq\b\4\1\2qy\3\2\2\2rs\5(\25\2st\b\4\1\2ty\3\2\2"+
		"\2uv\5*\26\2vw\b\4\1\2wy\3\2\2\2xC\3\2\2\2xH\3\2\2\2xK\3\2\2\2xN\3\2\2"+
		"\2xQ\3\2\2\2xT\3\2\2\2xW\3\2\2\2xZ\3\2\2\2x]\3\2\2\2x`\3\2\2\2xc\3\2\2"+
		"\2xf\3\2\2\2xi\3\2\2\2xl\3\2\2\2xo\3\2\2\2xr\3\2\2\2xu\3\2\2\2y\7\3\2"+
		"\2\2z{\7\34\2\2{|\7#\2\2|}\7\3\2\2}~\5\6\4\2~\177\b\5\1\2\177\t\3\2\2"+
		"\2\u0080\u0081\7\"\2\2\u0081\u008f\b\6\1\2\u0082\u0083\7\6\2\2\u0083\u0084"+
		"\7\"\2\2\u0084\u008f\b\6\1\2\u0085\u0086\7\"\2\2\u0086\u0087\7 \2\2\u0087"+
		"\u0088\7\"\2\2\u0088\u008f\b\6\1\2\u0089\u008a\7\6\2\2\u008a\u008b\7\""+
		"\2\2\u008b\u008c\7 \2\2\u008c\u008d\7\"\2\2\u008d\u008f\b\6\1\2\u008e"+
		"\u0080\3\2\2\2\u008e\u0082\3\2\2\2\u008e\u0085\3\2\2\2\u008e\u0089\3\2"+
		"\2\2\u008f\13\3\2\2\2\u0090\u0091\5\16\b\2\u0091\u009c\b\7\1\2\u0092\u0093"+
		"\7\7\2\2\u0093\u0094\5\16\b\2\u0094\u0095\b\7\1\2\u0095\u009b\3\2\2\2"+
		"\u0096\u0097\7\b\2\2\u0097\u0098\5\16\b\2\u0098\u0099\b\7\1\2\u0099\u009b"+
		"\3\2\2\2\u009a\u0092\3\2\2\2\u009a\u0096\3\2\2\2\u009b\u009e\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\r\3\2\2\2\u009e\u009c\3\2\2\2"+
		"\u009f\u00a0\5\20\t\2\u00a0\u00ab\b\b\1\2\u00a1\u00a2\7\t\2\2\u00a2\u00a3"+
		"\5\20\t\2\u00a3\u00a4\b\b\1\2\u00a4\u00aa\3\2\2\2\u00a5\u00a6\7\n\2\2"+
		"\u00a6\u00a7\5\20\t\2\u00a7\u00a8\b\b\1\2\u00a8\u00aa\3\2\2\2\u00a9\u00a1"+
		"\3\2\2\2\u00a9\u00a5\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\17\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\5\22\n"+
		"\2\u00af\u00b6\b\t\1\2\u00b0\u00b1\7\13\2\2\u00b1\u00b2\5\20\t\2\u00b2"+
		"\u00b3\b\t\1\2\u00b3\u00b5\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b5\u00b8\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\21\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b9\u00ba\7#\2\2\u00ba\u00c2\b\n\1\2\u00bb\u00bc\5\n\6\2\u00bc"+
		"\u00bd\b\n\1\2\u00bd\u00c2\3\2\2\2\u00be\u00bf\5\30\r\2\u00bf\u00c0\b"+
		"\n\1\2\u00c0\u00c2\3\2\2\2\u00c1\u00b9\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c1"+
		"\u00be\3\2\2\2\u00c2\23\3\2\2\2\u00c3\u00c4\7#\2\2\u00c4\u00c9\b\13\1"+
		"\2\u00c5\u00c6\5\n\6\2\u00c6\u00c7\b\13\1\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00c3\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c9\25\3\2\2\2\u00ca\u00d2\7\f\2"+
		"\2\u00cb\u00cc\7+\2\2\u00cc\u00d1\b\f\1\2\u00cd\u00ce\5\6\4\2\u00ce\u00cf"+
		"\b\f\1\2\u00cf\u00d1\3\2\2\2\u00d0\u00cb\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d1"+
		"\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\b\f\1\2\u00d7"+
		"\u00d8\7\r\2\2\u00d8\27\3\2\2\2\u00d9\u00da\7\36\2\2\u00da\u00db\b\r\1"+
		"\2\u00db\31\3\2\2\2\u00dc\u00dd\7!\2\2\u00dd\u00de\7#\2\2\u00de\u00df"+
		"\b\16\1\2\u00df\33\3\2\2\2\u00e0\u00e1\5 \21\2\u00e1\u00e2\5\36\20\2\u00e2"+
		"\u00e3\b\17\1\2\u00e3\35\3\2\2\2\u00e4\u00e5\7\16\2\2\u00e5\u00e6\5 \21"+
		"\2\u00e6\u00e7\b\20\1\2\u00e7\u00e8\5\36\20\2\u00e8\u00e9\b\20\1\2\u00e9"+
		"\u00f2\3\2\2\2\u00ea\u00eb\7\17\2\2\u00eb\u00ec\5 \21\2\u00ec\u00ed\b"+
		"\20\1\2\u00ed\u00ee\5\36\20\2\u00ee\u00ef\b\20\1\2\u00ef\u00f2\3\2\2\2"+
		"\u00f0\u00f2\b\20\1\2\u00f1\u00e4\3\2\2\2\u00f1\u00ea\3\2\2\2\u00f1\u00f0"+
		"\3\2\2\2\u00f2\37\3\2\2\2\u00f3\u00f4\5\f\7\2\u00f4\u00f5\t\2\2\2\u00f5"+
		"\u00f6\5\f\7\2\u00f6\u00f7\b\21\1\2\u00f7\u00fc\3\2\2\2\u00f8\u00f9\5"+
		"\f\7\2\u00f9\u00fa\b\21\1\2\u00fa\u00fc\3\2\2\2\u00fb\u00f3\3\2\2\2\u00fb"+
		"\u00f8\3\2\2\2\u00fc!\3\2\2\2\u00fd\u00fe\7\26\2\2\u00fe\u00ff\5\34\17"+
		"\2\u00ff\u0100\7\r\2\2\u0100\u0102\7\27\2\2\u0101\u0103\5\6\4\2\u0102"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0106\3\2\2\2\u0106\u0107\7\30\2\2\u0107\u0108\b\22\1\2\u0108"+
		"#\3\2\2\2\u0109\u010a\7\31\2\2\u010a\u010b\7\4\2\2\u010b\u010c\5\34\17"+
		"\2\u010c\u010d\7\5\2\2\u010d\u010f\7\27\2\2\u010e\u0110\5\6\4\2\u010f"+
		"\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0113\3\2\2\2\u0113\u0114\7\30\2\2\u0114\u0115\b\23\1\2\u0115"+
		"%\3\2\2\2\u0116\u0118\7\27\2\2\u0117\u0119\5\6\4\2\u0118\u0117\3\2\2\2"+
		"\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u011d\7\30\2\2\u011d\u011e\b\24\1\2\u011e\'\3\2\2\2\u011f"+
		"\u0120\7\32\2\2\u0120\u0121\7#\2\2\u0121\u0123\7\27\2\2\u0122\u0124\5"+
		"\6\4\2\u0123\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\7\30\2\2\u0128\u0129\b"+
		"\25\1\2\u0129)\3\2\2\2\u012a\u012b\7\33\2\2\u012b\u012c\7#\2\2\u012c\u012d"+
		"\7\r\2\2\u012d\u012e\b\26\1\2\u012e+\3\2\2\2\25\619x\u008e\u009a\u009c"+
		"\u00a9\u00ab\u00b6\u00c1\u00c8\u00d0\u00d4\u00f1\u00fb\u0104\u0111\u011a"+
		"\u0125";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}