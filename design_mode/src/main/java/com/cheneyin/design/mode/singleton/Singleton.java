package com.cheneyin.design.mode.singleton;

/**
 * 02.设计模式之单例模式
 */
public class Singleton {

    private static Singleton singleton=null;

    /*
       3.懒汉模式，直接new出来
     */
//    privite  static Singleton singleton=new Singleton();

    /*
        4.双重加锁机制
     */
//    privite volatile static Singleton singleton=null;


    /*
        私有化，不给外界直接new的机会
     */
    private Singleton() {
    }

    /*
        1.简化实现的单例模式，但遇到多线程肯定有问题
     */
    public static Singleton getInstance(){
        if (singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }

    /*
        2.通过加锁进行控制多线程临界资源冲突，不推荐，对线程资源消耗大
     */
//    public static synchronized Singleton getInstance(){
//        if(singleton==null){
//            singleton=new Singleton();
//        }
//        return singleton;
//    }

    /*
        4.双重加锁机制
     */
//    public static Singleton getInstance(){
//        if(singleton==null){
//            synchronized(Singleton.class){
//                if(singleton==null){
//                    singleton=new Singleton();
//                }
//            }
//        }
//        return singleton;
//    }
}
