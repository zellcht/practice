package com.zell.practice.local.basic;

/**
 * Created by Z on 2019/5/9.
 */
public class Cat extends AbstractAnimal implements InterfaceJump {
    @Override
    public void cry() {
        System.out.println("===miao===");
    }

    @Override
    public void jump() {
        System.out.println("===Cat jumps===");
    }
}
