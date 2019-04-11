package com.hjw.patterns.create.singleton;

/**
 * 静态内部类方式(推荐用)
 * 和饿汉式类似,不同的是，在调用getInstance的时候才装载SingletonInstance
 * 使得有了lazy_load的效果
 * @see Singleton1
 */
public class Singleton6 {
    private Singleton6(){}
    public static Singleton6 getInstance(){
        return SingletonInstance.INSTANCE;
    }
    private static class SingletonInstance{
        private static Singleton6 INSTANCE = new Singleton6();
    }
}
