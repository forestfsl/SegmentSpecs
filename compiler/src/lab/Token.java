package lab;

/**
 * Created by songlin on 2020/3/27.
 */
/*
一个简单的Token
 */
public interface Token {
    /*
    Token 的类型
     */
    public  TokenType getType();

    /*
    Token 的文本值
     */
    public  String getText();
}
