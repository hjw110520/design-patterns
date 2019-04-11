package com.hjw.patterns.create.singleton;

/**
 * 懒汉式（线程不安全）
 * 相比饿汉式，可以在使用的时候才实例化
 * 但是线程不安全，不可用
 */
public class Singleton3 {
    private static Singleton3 instance;
    private Singleton3(){}
    public Singleton3 getInstance(){
        if(null == instance){
            instance = new Singleton3();
        }
        return instance;
    }
}
