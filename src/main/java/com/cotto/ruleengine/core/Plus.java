package com.cotto.ruleengine.core;

public class Plus implements  Expression {
    @Override
    public int interpret(Context context) {
        return context.getOne() + context.getAnotherOne();
    }
}
