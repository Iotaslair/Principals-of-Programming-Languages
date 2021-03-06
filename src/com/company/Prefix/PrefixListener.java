// Generated from C:/Users/billy/POPL/Principals-of-Programming-Languages/src/com/company/Prefix\Prefix.g4 by ANTLR 4.8
package com.company.Prefix;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PrefixParser}.
 */
public interface PrefixListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PrefixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PrefixParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PrefixParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefixParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(PrefixParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(PrefixParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefixParser#booleanvalue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanvalue(PrefixParser.BooleanvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixParser#booleanvalue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanvalue(PrefixParser.BooleanvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefixParser#integervalue}.
	 * @param ctx the parse tree
	 */
	void enterIntegervalue(PrefixParser.IntegervalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixParser#integervalue}.
	 * @param ctx the parse tree
	 */
	void exitIntegervalue(PrefixParser.IntegervalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefixParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(PrefixParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(PrefixParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefixParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(PrefixParser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(PrefixParser.IfstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefixParser#variabledeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariabledeclaration(PrefixParser.VariabledeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixParser#variabledeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariabledeclaration(PrefixParser.VariabledeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefixParser#variablename}.
	 * @param ctx the parse tree
	 */
	void enterVariablename(PrefixParser.VariablenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixParser#variablename}.
	 * @param ctx the parse tree
	 */
	void exitVariablename(PrefixParser.VariablenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefixParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(PrefixParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(PrefixParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefixParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(PrefixParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(PrefixParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefixParser#subtract}.
	 * @param ctx the parse tree
	 */
	void enterSubtract(PrefixParser.SubtractContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixParser#subtract}.
	 * @param ctx the parse tree
	 */
	void exitSubtract(PrefixParser.SubtractContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefixParser#multiply}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(PrefixParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixParser#multiply}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(PrefixParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefixParser#functiondeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondeclaration(PrefixParser.FunctiondeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixParser#functiondeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondeclaration(PrefixParser.FunctiondeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefixParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(PrefixParser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(PrefixParser.FunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefixParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(PrefixParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(PrefixParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefixParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(PrefixParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(PrefixParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefixParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(PrefixParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(PrefixParser.NotContext ctx);
}