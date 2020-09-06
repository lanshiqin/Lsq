package com.lanshiqin.lsq.rule;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Scanner;

/**
 * LSQ脚本程序入口
 * @author 蓝士钦
 */
public class LsqScript {

    public static void main(String[] args) {

        System.out.println("lsq script 0.0.1 (2020-09-06)");
        System.out.println("\n>>> ");

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            String script = scanner.nextLine();
            Integer result = calculator(script);
            System.out.println(result);
            System.out.println("\n>>> ");
        }

    }

    public static Integer calculator(String script){
        //词法分析
        LsqScriptLexer lexer = new LsqScriptLexer(CharStreams.fromString(script));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //语法分析
        LsqScriptParser parser = new LsqScriptParser(tokens);
        ParseTree tree = parser.additiveExpression();

        //打印语法树
        System.out.println("tree : " + script);
        System.out.println(tree.toStringTree(parser));

        //解释执行
        ASTInterpreter astInterpreter = new ASTInterpreter();
        return astInterpreter.visit(tree);

    }
}
