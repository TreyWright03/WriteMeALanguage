package WriteMeAFunction;
import java.util.List;
import java.util.Scanner;

import WriteMeAFunction.AST.AddExp;
import WriteMeAFunction.AST.AndExp;
import WriteMeAFunction.AST.AssignExp;
import WriteMeAFunction.AST.BlockExp;
import WriteMeAFunction.AST.CompareExp;
import WriteMeAFunction.AST.DefineDecl;
import WriteMeAFunction.AST.DivExp;
import WriteMeAFunction.AST.EnterQuestExp;
import WriteMeAFunction.AST.Exp;
import WriteMeAFunction.AST.FunctionCall;
import WriteMeAFunction.AST.FunctionDef;
import WriteMeAFunction.AST.IfExp;
import WriteMeAFunction.AST.MultExp;
import WriteMeAFunction.AST.NegExp;
import WriteMeAFunction.AST.NumExp;
import WriteMeAFunction.AST.OrExp;
import WriteMeAFunction.AST.PowExp;
import WriteMeAFunction.AST.PrintExp;
import WriteMeAFunction.AST.Program;
import WriteMeAFunction.AST.RollExp;
import WriteMeAFunction.AST.StrLitExp;
import WriteMeAFunction.AST.SubExp;
import WriteMeAFunction.AST.UnitExp;
import WriteMeAFunction.AST.VarExp;
import WriteMeAFunction.AST.Visitor;
import WriteMeAFunction.AST.WhileExp;
import WriteMeAFunction.Env.GlobalEnv;
import WriteMeAFunction.Value.NumVal;
import WriteMeAFunction.Value.StrVal;
import WriteMeAFunction.Value.UnitVal;

public class Evaluator implements Visitor<Value> {
	
	Env initEnv = new GlobalEnv(); //New for WriteMeAFunction
	
	Value valueOf(Program p) {
		return (Value) p.accept(this, initEnv);
	}
	
	@Override
	public Value visit(AddExp e, Env env) {
		List<Exp> operands = e.all();
		double result = 0;
		for(Exp exp: operands) {
			NumVal intermediate = (NumVal) exp.accept(this, env); // Dynamic type-checking
			result += intermediate.v(); //Semantics of AddExp in terms of the target language.
		}
		return new NumVal(result);
	}

	@Override
	public Value visit(NumExp e, Env env) {
		return new NumVal(e.v());
	}

	@Override
	public Value visit(UnitExp e, Env env) {
		return new UnitVal();
	}

	@Override
	public Value visit(DivExp e, Env env) {
		List<Exp> operands = e.all();
		NumVal lVal = (NumVal) operands.get(0).accept(this, env);
		double result = lVal.v(); 
		for(int i=1; i<operands.size(); i++) {
			NumVal rVal = (NumVal) operands.get(i).accept(this, env);
			result = result / rVal.v();
		}
		return new NumVal(result);
	}

	@Override
	public Value visit(MultExp e, Env env) {
		List<Exp> operands = e.all();
		double result = 1;
		for(Exp exp: operands) {
			NumVal intermediate = (NumVal) exp.accept(this, env); // Dynamic type-checking
			result *= intermediate.v(); //Semantics of MultExp.
		}
		return new NumVal(result);
	}
	@Override
	public Value visit(PowExp e, Env env) {
		List<Exp> operands = e.all();
		NumVal lVal = (NumVal) operands.get(0).accept(this, env);
		double result = lVal.v();
		for(int i=1; i<operands.size(); i++) {
			NumVal rVal = (NumVal) operands.get(i).accept(this, env);
			result = Math.pow(result, rVal.v());
		}
		return new NumVal(result);
	}

	@Override
	public Value visit(NegExp e, Env env) {
		NumVal rVal = (NumVal) e.getExp().accept(this, env);
		return new NumVal(-rVal.v());
	}

	@Override
	public Value visit(Program p, Env env) {
		for(DefineDecl d: p.decls())
			d.accept(this, initEnv);
		return (Value) p.e().accept(this, initEnv);
	}

	@Override
	public Value visit(SubExp e, Env env) {
		List<Exp> operands = e.all();
		NumVal lVal = (NumVal) operands.get(0).accept(this, env);
		double result = lVal.v();
		for(int i=1; i<operands.size(); i++) {
			NumVal rVal = (NumVal) operands.get(i).accept(this, env);
			result = result - rVal.v();
		}
		return new NumVal(result);
	}

	@Override
	public Value visit(VarExp e, Env env) {
		Value val = env.get(e.name());
		if (val == null) {
			throw new RuntimeException("Undefined variable: " + e.name());
		}
		return val;
	}
	
	
	@Override
	public Value visit(DefineDecl d, Env env) { // New for WriteMeAFunction.
		String name = d.name();
		Exp value_exp = d.value_exp();
		Value value = (Value) value_exp.accept(this, env);
		((GlobalEnv) initEnv).extend(name, value);
		return new Value.UnitVal();		
	}	
	@Override
	public Value visit(PrintExp e, Env env) {
		for (Exp part : e.getParts()) {
			Value val = part.accept(this, env);
			String out = val.toString();
			if (!(val instanceof Value.UnitVal)) {
				System.out.print(out);
				System.out.println(); // Add newline after each part
			}
		}
		return new UnitVal();
	}
	
	@Override
public Value visit(EnterQuestExp e, Env env) {
    System.out.print("> "); // input prompt
    Scanner scanner = new Scanner(System.in);
    String input = "";
    if (scanner.hasNextLine()) {
        input = scanner.nextLine().trim();
    }
    if (input.isEmpty()) {
        return new UnitVal(); // return unit value for empty input
    }
    try {
        double val = Double.parseDouble(input);
        env.set(e.name(), new NumVal(val)); // set variable in environment
    } catch (NumberFormatException ex) {
        env.set(e.name(), new Value.StrVal(input)); // fallback: treat as string
    }
    return new UnitVal();
}
	@Override
	public Value visit(StrLitExp e, Env env) {
	return new StrVal(e.value());
	}

	@Override
	public Value visit(RollExp e, Env env) {
	int result = 1 + (int)(Math.random() * 6); // Generates a value from 1 to 6
	return new Value.NumVal(result);
	}

	private Value checkType(Value value, Class... types) {
        for (Class type : types) {
            if (type.isInstance(value)) {
                return value;
            }
        }
        return null;
    }
	
	@Override
	public Value visit(IfExp e, Env env) {
		// Evaluate the condition expression
		Value condVal = e.condition().accept(this, env);
	
		// Ensure it's a numeric value (used like a boolean)
		if (!(condVal instanceof NumVal)) {
			throw new RuntimeException("Condition must evaluate to a numeric value.");
		}
		condVal = checkType(condVal, NumVal.class);
		// Interpret non-zero as true
		double cond = ((NumVal) condVal).v();
		// Choose and evaluate the correct branch
		if (cond != 0) {
			return e.thenBranch().accept(this, env);
		} else {
			return new UnitVal();
		}
	}
	@Override
public Value visit(WhileExp e, Env env) {
    while (true) {
        // Evaluate the condition
        Value condVal = e.condition().accept(this, env);

        if (!(condVal instanceof NumVal)) {
            throw new RuntimeException("Condition must be a number (treated as boolean)");
        }

        // Get the condition value
        double cond = ((NumVal) condVal).v();
        
        // If condition is 0 (false), break the loop
        if (cond == 0) {
            break;
        }

        // Evaluate the body of the loop
        // This will loop through multiple expressions if grouped with brackets
        e.body().accept(this, env);  // Here, the body can now be a block with multiple statements
    }

    return new UnitVal(); // Return Unit value to signify no meaningful return
}
	@Override
	public Value visit(CompareExp e, Env env) {
	double l = ((NumVal) e.left().accept(this, env)).v();
	double r = ((NumVal) e.right().accept(this, env)).v();
	boolean result;

	switch (e.op()) {
		case ">": result = l > r; break;
		case "<": result = l < r; break;
		case ">=": result = l >= r; break;
		case "<=": result = l <= r; break;
		case "==": result = l == r; break;
		case "!=": result = l != r; break;
		default: throw new RuntimeException("Unknown operator: " + e.op());
	}

		return new Value.NumVal(result ? 1 : 0); // return 1 for true, 0 for false
	}

	@Override
	public Value visit(BlockExp e, Env env) {
		Value result = new UnitVal();
		for (Exp exp : e.getExpressions()) {
			result = exp.accept(this, env);
		}
		return result;
	}

	@Override
	public Value visit(AndExp e, Env env) {
		for (Exp exp : e.getOperands()) {
			Value val = exp.accept(this, env);
			if (!(val instanceof NumVal)) {
				throw new RuntimeException("Boolean operations require numeric values");
			}
			if (((NumVal) val).v() == 0) {
				return new NumVal(0); // false
			}
		}
		return new NumVal(1); // true
	}

	@Override
	public Value visit(OrExp e, Env env) {
		for (Exp exp : e.getOperands()) {
			Value val = exp.accept(this, env);
			if (!(val instanceof NumVal)) {
				throw new RuntimeException("Boolean operations require numeric values");
			}
			if (((NumVal) val).v() != 0) {
				return new NumVal(1); // true
			}
		}
		return new NumVal(0); // false
	}

	@Override
	public Value visit(AssignExp e, Env env) {
		Value value = e.value_exp().accept(this, env);
		env.set(e.name(), value);
		return new UnitVal();
	}

	@Override
	public Value visit(FunctionDef e, Env env) {
		// Store the function definition in the environment
		env.set(e.name(), new Value.FunctionVal(e.body()));
		return new UnitVal();
	}

	@Override
	public Value visit(FunctionCall e, Env env) {
		// Look up the function definition
		Value funcVal = env.get(e.name());
		if (!(funcVal instanceof Value.FunctionVal)) {
			throw new RuntimeException("Not a function: " + e.name());
		}
		
		// Get the function body and evaluate it
		Exp body = ((Value.FunctionVal)funcVal).body();
		return body.accept(this, env);
	}

}
