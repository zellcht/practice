package com.zell.practice.local.basic;

/**
 * Created by Z on 2019/5/9.
 */
public class Dog extends AbstractAnimal implements InterfaceJump{
    @Override
    public void cry() {
        System.out.println("===wang===");
    }

    @Override
    public void jump() {
        System.out.println("===Dog jump===");
    }
}
