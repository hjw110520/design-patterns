package com.hjw.patterns.create.singleton;

/**
 * 饿汉式（静态块）
 * 与静态变量一样
 * @see Singleton1
 */
public class Singleton2 {
    private static Singleton2 INSTANCE;
    static {
        INSTANCE = new Singleton2();
    }
    private Singleton2(){}
    public Singleton2 getInstance(){
        return INSTANCE;
    }
}
