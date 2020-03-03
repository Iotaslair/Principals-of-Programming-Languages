// Generated from C:/Users/billy/POPL/Principals-of-Programming-Languages/src/com/company\Boolang.g4 by ANTLR 4.8
package com.company.Boolang;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BoolangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BoolangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BoolangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(BoolangParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoolangParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(BoolangParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoolangParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(BoolangParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoolangParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(BoolangParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoolangParser#not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(BoolangParser.NotContext ctx);
}