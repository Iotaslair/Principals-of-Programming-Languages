// Generated from C:/Users/billy/POPL/Principals-of-Programming-Languages/src/com/company\Boolang.g4 by ANTLR 4.8
package com.company.Boolang;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BoolangParser}.
 */
public interface BoolangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BoolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(BoolangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(BoolangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoolangParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(BoolangParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoolangParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(BoolangParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoolangParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(BoolangParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoolangParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(BoolangParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoolangParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(BoolangParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoolangParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(BoolangParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoolangParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(BoolangParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoolangParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(BoolangParser.NotContext ctx);
}