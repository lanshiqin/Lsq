/*
 BSD 3-Clause License

 Copyright (c) 2020, 蓝士钦
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions are met:

 1. Redistributions of source code must retain the above copyright notice, this
    list of conditions and the following disclaimer.

 2. Redistributions in binary form must reproduce the above copyright notice,
    this list of conditions and the following disclaimer in the documentation
    and/or other materials provided with the distribution.

 3. Neither the name of the copyright holder nor the names of its
    contributors may be used to endorse or promote products derived from
    this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
// 语法规则文件
grammar LsqScript;

// 导入词法定义
import BaseLexer;

// 定义语法规则生成的源代码文件头部
@header {
package com.lanshiqin.lsq.rule;
}

// 字面量定义
literal
	:	IntegerLiteral
	|	FloatingPointLiteral
	|	BooleanLiteral
	|	CharacterLiteral
	|	StringLiteral
	|	NullLiteral
	;

// 基本数据类型定义
primitiveType
    :   'Number'
    |   'String'
    |   'var'
    |   'val'
    ;

// 表达式
statement
    :   expressionStatement
    |   compoundStatement
    ;

// 表达式语句定义
expressionStatement
    :   expression? ';'
    ;

// 表达式定义
expression
    :   assignmentExpression
    |   expression ',' assignmentExpression
    ;

// 复合表达式定义
compoundStatement
    :   '{' blockItemList? '}'
    ;

// 语句块集合定义
blockItemList
    :   blockItem
    |   blockItemList blockItem
    ;

// 语句块
blockItem
    :   statement
    |   declaration
    ;

// 变量声明定义
declaration
    : primitiveType Identifier
    | primitiveType Identifier initializer
    ;

// 初始化赋值定义
initializer
    :   assignmentOperator assignmentExpression
    ;

// 赋值操作
assignmentOperator
	:	'='
	|	'*='
	|	'/='
	|	'%='
	|	'+='
	|	'-='
	|	'<<='
	|	'>>='
	|	'>>>='
	|	'&='
	|	'^='
	|	'|='
	;

// 赋值表达式
assignmentExpression
    :   additiveExpression
    |   Identifier assignmentOperator additiveExpression
    ;

// 加法表达式，Antlr能够支持左递归
additiveExpression
    :   multiplicativeExpression
    |   additiveExpression '+' multiplicativeExpression
    |   additiveExpression '-' multiplicativeExpression
    ;

// 乘法表达式，Antlr能够支持左递归
multiplicativeExpression
    :   primaryExpression
    |   multiplicativeExpression '*' primaryExpression
    |   multiplicativeExpression '/' primaryExpression
    |   multiplicativeExpression '%' primaryExpression
    ;

// 初级表达式定义
primaryExpression
    :   Identifier
    |   literal
    |   Identifier '(' argumentExpressionList? ')'
    |   '(' expression ')'
    ;

// 参数表达式列表定义
argumentExpressionList
    :   assignmentExpression
    |   argumentExpressionList ',' assignmentExpression
    ;
