// Generated from C:/Users/billy/POPL/Principals-of-Programming-Languages/src/com/company/Prefix\Prefix.g4 by ANTLR 4.8
package com.company.Prefix;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PrefixParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PrefixVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PrefixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PrefixParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefixParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(PrefixParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefixParser#booleanvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanvalue(PrefixParser.BooleanvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefixParser#integervalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegervalue(PrefixParser.IntegervalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefixParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(PrefixParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefixParser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstatement(PrefixParser.IfstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefixParser#variabledeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariabledeclaration(PrefixParser.VariabledeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefixParser#variablename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariablename(PrefixParser.VariablenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefixParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(PrefixParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefixParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(PrefixParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefixParser#subtract}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtract(PrefixParser.SubtractContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefixParser#multiply}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(PrefixParser.MultiplyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefixParser#functiondeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondeclaration(PrefixParser.FunctiondeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefixParser#functioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(PrefixParser.FunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefixParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(PrefixParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefixParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(PrefixParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefixParser#not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(PrefixParser.NotContext ctx);
}