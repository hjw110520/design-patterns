package com.hjw.patterns.create.singleton;

/**
 * 懒汉式（同步方法）
 * @see Singleton3
 * getInstance() 加synchronized，线程安全，但是效率很低
 * 不推荐使用
 */
public class Singleton4 {
    private static Singleton4 instance;
    private Singleton4(){}
    public synchronized Singleton4 getInstance(){
        if(null == instance){
            instance = new Singleton4();
        }
        return instance;
    }
}
