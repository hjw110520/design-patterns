package com.hjw.patterns.create.singleton;

/**
 * 懒汉式（double-check）
 * @see Singleton3
 * @see Singleton4
 * 线程安全，并且解决了用synchronized低效的问题
 */
public class Singleton5 {
    private static volatile Singleton5 instance;
    private Singleton5(){}
    public  Singleton5 getInstance(){
        if(null == instance){
            synchronized (Singleton5.class){
                if(null == instance){
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}
