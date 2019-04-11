package com.hjw.patterns.create.singleton;

/**
 * 枚举式
 * 避免多线程同步问题，而且还能防止反序列化重新创建新的对象
 * 最佳方式
 * Joshua Bloch, Effective Java 2nd Edition p.18
 * A single-element enum type is the best way to implement a singleton
 */
public enum  Singleton7 {
    INSTANCE
}
