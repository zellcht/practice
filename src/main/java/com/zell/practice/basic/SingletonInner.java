package com.zell.practice.basic;

public class SingletonInner {
    private SingletonInner(){
    }
    private static class SingleTonHolder{
        private static final SingletonInner INSTANCE = new SingletonInner();
    }
    public static SingletonInner getInstance(){
        return SingleTonHolder.INSTANCE;
    }
}
