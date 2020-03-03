// Generated from C:/Users/billy/POPL/Principals-of-Programming-Languages/src/com/company\Prefix.g4 by ANTLR 4.8
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