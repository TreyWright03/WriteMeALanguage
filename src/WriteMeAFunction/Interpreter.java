package WriteMeAFunction;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

import WriteMeAFunction.AST.*;
import WriteMeAFunction.AST.Program;

/**
 * This main class implements the Read-Eval-Print-Loop of the interpreter with
 * the help of Reader, Evaluator, and Printer classes. 
 * 
 * @author hridesh
 *
 */
public class Interpreter {
	public static void main(String[] args) {
		if (args.length > 0) {
			// Run from file
			try {
				BufferedReader reader = new BufferedReader(new FileReader(args[0]));
				StringBuilder program = new StringBuilder();
				String line;
				while ((line = reader.readLine()) != null) {
					program.append(line).append("\n");
				}
				reader.close();
				
				Reader parser = new Reader();
				Evaluator eval = new Evaluator();
				Printer printer = new Printer();
				
				Program p = parser.parse(program.toString());
				Value val = eval.valueOf(p);
				printer.print(val);
			} catch (Exception e) {
				System.out.println("Error running program: " + e.getMessage());
				e.printStackTrace();
			}
		} else {
			// Run in REPL mode
			System.out.println("Type a program to evaluate and press the enter key," + 
							" e.g. (define result (let ((a 3) (b 100) (c 84) (d 279) (e 277)) (+ (* a b) (/ c (- d e))))) result \n" + 
							" or (define a 3) (define b 100) (define c 84) (define d 279) (define e 277) (+ (* a b) (/ c (- d e))) \n" +
							"Press Ctrl + C to exit.");
			Reader reader = new Reader();
			Evaluator eval = new Evaluator();
			Printer printer = new Printer();
			REPL: while (true) { // Read-Eval-Print-Loop (also known as REPL)
				Program p = null;
				try {
					p = reader.read();
					if(p._e == null) continue REPL;
					Value val = eval.valueOf(p);
					printer.print(val);
				} catch (Env.LookupException e) {
					printer.print(e);
				} catch (IOException e) {
					System.out.println("Error reading input:" + e.getMessage());
				} catch (NullPointerException e) {
				
				}
			}
		}
	}
}
