package com.hjw.patterns.create.singleton;

/**
 * 实际应用中
 * 可选枚举式，静态内部类式，doubule_check式
 */
public class Test {
    public static void main(String args[]){
        Singleton7 obj1 = Singleton7.INSTANCE;
        Singleton7 obj2 = Singleton7.INSTANCE;
        System.out.println(obj1 == obj2);

        Singleton6 obj3 = Singleton6.getInstance();
        Singleton6 obj4 = Singleton6.getInstance();
        System.out.println(obj3 == obj4);


    }
}
