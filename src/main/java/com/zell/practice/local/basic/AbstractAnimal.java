package com.zell.practice.local.basic;

/**
 * Created by Z on 2019/5/9.
 */
public abstract class AbstractAnimal {
    protected int x;
    private  int y;
    public abstract void cry();

    public void eat(){
        System.out.println("===eat===");
    }
}
