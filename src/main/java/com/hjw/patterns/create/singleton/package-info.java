package com.hjw.patterns.create.singleton;
/**
 * 单例模式：确保只有一个实例
 *
 * 私有化构造函数
 *
 * 饿汉式：利用类加载机制，在类加载的时候就初始化实例，可以避免同步问题。
 *         但有可能该实例从未被利用过，造成浪费内存
 *         @see com.hjw.patterns.create.singleton.Singleton1
 *         @see com.hjw.patterns.create.singleton.Singleton2
 * 懒汉式：在第一次使用实例的时候初始化，达到懒加载的目的，要考虑线程安全
 *         可以用同步方法保证线程安全，但是效率低下
 *         @see com.hjw.patterns.create.singleton.Singleton4
 *         可以用double_check保证线程安全,推荐使用
 *         @see com.hjw.patterns.create.singleton.Singleton5
 * 静态内部类方式：结合饿汉式和懒汉式的有点
 *         @see com.hjw.patterns.create.singleton.Singleton6
 * 枚举式：Effective Java推荐的最佳方式，避免多线程同步问题，而且还能防止反序列化重新创建新的对象
 *         @see com.hjw.patterns.create.singleton.Singleton7
 *
 */