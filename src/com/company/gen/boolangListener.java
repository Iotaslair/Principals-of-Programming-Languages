// Generated from C:/Users/billy/POPL/Principals-of-Programming-Languages/src/com/company\boolang.g4 by ANTLR 4.8
package com.company.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link boolangParser}.
 */
public interface boolangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link boolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(boolangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link boolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(boolangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link boolangParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(boolangParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link boolangParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(boolangParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link boolangParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(boolangParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link boolangParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(boolangParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link boolangParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(boolangParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link boolangParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(boolangParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link boolangParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(boolangParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link boolangParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(boolangParser.NotContext ctx);
}