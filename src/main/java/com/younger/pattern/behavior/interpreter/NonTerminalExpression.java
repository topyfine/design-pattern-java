package com.younger.pattern.behavior.interpreter;

/**
 * @author Younger
 */
public class NonTerminalExpression implements Expression {

    private Expression left;

    private Expression right;

    @Override
    public void interpret() {
//        left.interpret() + right.interpret();
    }
}
