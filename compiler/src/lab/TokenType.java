package lab;

/**
 * Created by songlin on 2020/3/27.
 */

/*
Token 的类型
 */
public enum TokenType {
    Plus, // +
    Minus, //-
    Star, // *
    Slash,// /

    GE,//>=
    GT,//>
    EQ,//==
    LE,//<=
    LT,//<

    SemiColon,//;
    LeftParen,//{
    RightParen,//}

    Assignment,// =

    If,
    Else,

    Int,

    Identifier,//标识符

    IntLiteral,//整型字面量
    StringLiteral //字符串面量

}

