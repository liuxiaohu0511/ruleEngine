package com.cotto.ruleengine.core;

public class InterpretorDemo {
    public static void main(String[] args) {
        int result = new Plus().interpret(new Context(1, 2));
        System.out.println("result: " + result);
    }
}
