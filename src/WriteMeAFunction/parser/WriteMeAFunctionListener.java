// Generated from WriteMeAFunction.g by ANTLR 4.5
package WriteMeAFunction.parser; import static WriteMeAFunction.AST.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WriteMeAFunctionParser}.
 */
public interface WriteMeAFunctionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WriteMeAFunctionParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(WriteMeAFunctionParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link WriteMeAFunctionParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(WriteMeAFunctionParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link WriteMeAFunctionParser#definedecl}.
	 * @param ctx the parse tree
	 */
	void enterDefinedecl(WriteMeAFunctionParser.DefinedeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link WriteMeAFunctionParser#definedecl}.
	 * @param ctx the parse tree
	 */
	void exitDefinedecl(WriteMeAFunctionParser.DefinedeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link WriteMeAFunctionParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(WriteMeAFunctionParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link WriteMeAFunctionParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(WriteMeAFunctionParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link WriteMeAFunctionParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(WriteMeAFunctionParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WriteMeAFunctionParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(WriteMeAFunctionParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WriteMeAFunctionParser#numexp}.
	 * @param ctx the parse tree
	 */
	void enterNumexp(WriteMeAFunctionParser.NumexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link WriteMeAFunctionParser#numexp}.
	 * @param ctx the parse tree
	 */
	void exitNumexp(WriteMeAFunctionParser.NumexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link WriteMeAFunctionParser#infixaddsubt}.
	 * @param ctx the parse tree
	 */
	void enterInfixaddsubt(WriteMeAFunctionParser.InfixaddsubtContext ctx);
	/**
	 * Exit a parse tree produced by {@link WriteMeAFunctionParser#infixaddsubt}.
	 * @param ctx the parse tree
	 */
	void exitInfixaddsubt(WriteMeAFunctionParser.InfixaddsubtContext ctx);
	/**
	 * Enter a parse tree produced by {@link WriteMeAFunctionParser#infixmuldiv}.
	 * @param ctx the parse tree
	 */
	void enterInfixmuldiv(WriteMeAFunctionParser.InfixmuldivContext ctx);
	/**
	 * Exit a parse tree produced by {@link WriteMeAFunctionParser#infixmuldiv}.
	 * @param ctx the parse tree
	 */
	void exitInfixmuldiv(WriteMeAFunctionParser.InfixmuldivContext ctx);
	/**
	 * Enter a parse tree produced by {@link WriteMeAFunctionParser#infixpower}.
	 * @param ctx the parse tree
	 */
	void enterInfixpower(WriteMeAFunctionParser.InfixpowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link WriteMeAFunctionParser#infixpower}.
	 * @param ctx the parse tree
	 */
	void exitInfixpower(WriteMeAFunctionParser.InfixpowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link WriteMeAFunctionParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(WriteMeAFunctionParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link WriteMeAFunctionParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(WriteMeAFunctionParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link WriteMeAFunctionParser#varexp}.
	 * @param ctx the parse tree
	 */
	void enterVarexp(WriteMeAFunctionParser.VarexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link WriteMeAFunctionParser#varexp}.
	 * @param ctx the parse tree
	 */
	void exitVarexp(WriteMeAFunctionParser.VarexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link WriteMeAFunctionParser#printexp}.
	 * @param ctx the parse tree
	 */
	void enterPrintexp(WriteMeAFunctionParser.PrintexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link WriteMeAFunctionParser#printexp}.
	 * @param ctx the parse tree
	 */
	void exitPrintexp(WriteMeAFunctionParser.PrintexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link WriteMeAFunctionParser#randexp}.
	 * @param ctx the parse tree
	 */
	void enterRandexp(WriteMeAFunctionParser.RandexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link WriteMeAFunctionParser#randexp}.
	 * @param ctx the parse tree
	 */
	void exitRandexp(WriteMeAFunctionParser.RandexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link WriteMeAFunctionParser#askexp}.
	 * @param ctx the parse tree
	 */
	void enterAskexp(WriteMeAFunctionParser.AskexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link WriteMeAFunctionParser#askexp}.
	 * @param ctx the parse tree
	 */
	void exitAskexp(WriteMeAFunctionParser.AskexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link WriteMeAFunctionParser#boolexp}.
	 * @param ctx the parse tree
	 */
	void enterBoolexp(WriteMeAFunctionParser.BoolexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link WriteMeAFunctionParser#boolexp}.
	 * @param ctx the parse tree
	 */
	void exitBoolexp(WriteMeAFunctionParser.BoolexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link WriteMeAFunctionParser#boolexp_rest}.
	 * @param ctx the parse tree
	 */
	void enterBoolexp_rest(WriteMeAFunctionParser.Boolexp_restContext ctx);
	/**
	 * Exit a parse tree produced by {@link WriteMeAFunctionParser#boolexp_rest}.
	 * @param ctx the parse tree
	 */
	void exitBoolexp_rest(WriteMeAFunctionParser.Boolexp_restContext ctx);
	/**
	 * Enter a parse tree produced by {@link WriteMeAFunctionParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(WriteMeAFunctionParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link WriteMeAFunctionParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(WriteMeAFunctionParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link WriteMeAFunctionParser#ifexp}.
	 * @param ctx the parse tree
	 */
	void enterIfexp(WriteMeAFunctionParser.IfexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link WriteMeAFunctionParser#ifexp}.
	 * @param ctx the parse tree
	 */
	void exitIfexp(WriteMeAFunctionParser.IfexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link WriteMeAFunctionParser#whileexp}.
	 * @param ctx the parse tree
	 */
	void enterWhileexp(WriteMeAFunctionParser.WhileexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link WriteMeAFunctionParser#whileexp}.
	 * @param ctx the parse tree
	 */
	void exitWhileexp(WriteMeAFunctionParser.WhileexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link WriteMeAFunctionParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(WriteMeAFunctionParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link WriteMeAFunctionParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(WriteMeAFunctionParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link WriteMeAFunctionParser#functiondef}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondef(WriteMeAFunctionParser.FunctiondefContext ctx);
	/**
	 * Exit a parse tree produced by {@link WriteMeAFunctionParser#functiondef}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondef(WriteMeAFunctionParser.FunctiondefContext ctx);
	/**
	 * Enter a parse tree produced by {@link WriteMeAFunctionParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(WriteMeAFunctionParser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link WriteMeAFunctionParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(WriteMeAFunctionParser.FunctioncallContext ctx);
}