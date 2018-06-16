package com.zhoujian.kotlindemo;

/**
 * Created by zhoujian on 2018/6/14.
 */


//饿汉模式，类加载时就已经进行实例化，类加载较慢，但获取对象速度快，线程安全
public class SingleInstance {
    //私有构造函数，防止通过构造器创建对象
    private SingleInstance() {}

    private static final SingleInstance instance = new SingleInstance();

    public static SingleInstance getInstance() {
        return instance;
    }
}
