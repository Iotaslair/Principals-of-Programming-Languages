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
	 * Visit a parse tree produced by {@link PrefixParser#booleanvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanvalue(PrefixParser.BooleanvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefixParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(PrefixParser.ValContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link PrefixParser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstatement(PrefixParser.IfstatementContext ctx);
}