// Generated from C:/Users/billy/POPL/Principals-of-Programming-Languages/src/com/company\boolang.g4 by ANTLR 4.8
package com.company.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link boolangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface boolangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link boolangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(boolangParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link boolangParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(boolangParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link boolangParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(boolangParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link boolangParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(boolangParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link boolangParser#not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(boolangParser.NotContext ctx);
}