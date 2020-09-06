package com.lanshiqin.lsq.rule;

/**
 * 语法树解释器
 * @author 蓝士钦
 */
public class ASTInterpreter extends LsqScriptBaseVisitor<Integer> {

    @Override
    public Integer visitAdditiveExpression(LsqScriptParser.AdditiveExpressionContext ctx) {
        if (ctx.ADD() != null || ctx.SUB() != null) {
            Integer left = visitAdditiveExpression(ctx.additiveExpression());
            Integer right = visitMultiplicativeExpression(ctx.multiplicativeExpression());
            if (ctx.ADD() != null) {
                return left + right;
            } else {
                return left - right;
            }
        } else {
            return visitMultiplicativeExpression(ctx.multiplicativeExpression());
        }
    }

    @Override
    public Integer visitMultiplicativeExpression(LsqScriptParser.MultiplicativeExpressionContext ctx) {
        if (ctx.MUL() != null || ctx.DIV() != null || ctx.MOD() != null) {
            Integer left = visitMultiplicativeExpression(ctx.multiplicativeExpression());
            Integer right = visitPrimaryExpression(ctx.primaryExpression());
            if (ctx.MUL() != null) {
                return left * right;
            } else if (ctx.DIV() != null) {
                return left / right;
            } else {
                return left % right;
            }
        } else {
            return visitPrimaryExpression(ctx.primaryExpression());
        }
    }

    @Override
    public Integer visitPrimaryExpression(LsqScriptParser.PrimaryExpressionContext ctx) {
        if (ctx.literal() != null) {
            return visitLiteral(ctx.literal());
        }
        return 0;
    }

    @Override
    public Integer visitLiteral(LsqScriptParser.LiteralContext ctx) {
        if (ctx.IntegerLiteral() !=null){
            return Integer.valueOf(ctx.IntegerLiteral().getText());
        }
        return 0;
    }
}
