// Generated from LsqScript.g4 by ANTLR 4.8

package com.lanshiqin.lsq.rule;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LsqScriptParser}.
 */
public interface LsqScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LsqScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(LsqScriptParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LsqScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(LsqScriptParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LsqScriptParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(LsqScriptParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LsqScriptParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(LsqScriptParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LsqScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LsqScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LsqScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LsqScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LsqScriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(LsqScriptParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LsqScriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(LsqScriptParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LsqScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LsqScriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LsqScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LsqScriptParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LsqScriptParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(LsqScriptParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LsqScriptParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(LsqScriptParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LsqScriptParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(LsqScriptParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LsqScriptParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(LsqScriptParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LsqScriptParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(LsqScriptParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link LsqScriptParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(LsqScriptParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link LsqScriptParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(LsqScriptParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LsqScriptParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(LsqScriptParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LsqScriptParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(LsqScriptParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link LsqScriptParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(LsqScriptParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link LsqScriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(LsqScriptParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LsqScriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(LsqScriptParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LsqScriptParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(LsqScriptParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LsqScriptParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(LsqScriptParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LsqScriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(LsqScriptParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LsqScriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(LsqScriptParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LsqScriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(LsqScriptParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LsqScriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(LsqScriptParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LsqScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(LsqScriptParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LsqScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(LsqScriptParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LsqScriptParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(LsqScriptParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LsqScriptParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(LsqScriptParser.ArgumentExpressionListContext ctx);
}