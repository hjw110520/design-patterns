package com.hjw.patterns.create.singleton;

/**
 * 饿汉式（静态变量）
 * 线程安全，在类装载的时候就实例化了，不涉及到线程同步问题，所以线程安全
 * 但是有可能该实例一直没使用过，造成内存浪费
 */
public class Singleton1 {
    private static Singleton1 INSTANCE = new Singleton1();
    private Singleton1(){}
    public Singleton1 getInstance(){
        return INSTANCE;
    }
}
