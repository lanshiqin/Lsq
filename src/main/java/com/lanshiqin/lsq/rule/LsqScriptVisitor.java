// Generated from LsqScript.g4 by ANTLR 4.8

package com.lanshiqin.lsq.rule;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LsqScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LsqScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LsqScriptParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(LsqScriptParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link LsqScriptParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(LsqScriptParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LsqScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LsqScriptParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LsqScriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(LsqScriptParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LsqScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LsqScriptParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LsqScriptParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(LsqScriptParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LsqScriptParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItemList(LsqScriptParser.BlockItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LsqScriptParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(LsqScriptParser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link LsqScriptParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(LsqScriptParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LsqScriptParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(LsqScriptParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link LsqScriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(LsqScriptParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LsqScriptParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(LsqScriptParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LsqScriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(LsqScriptParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LsqScriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(LsqScriptParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LsqScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(LsqScriptParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LsqScriptParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionList(LsqScriptParser.ArgumentExpressionListContext ctx);
}