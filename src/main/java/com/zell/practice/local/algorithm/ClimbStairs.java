package com.zell.practice.local.algorithm;

/**
 * Created by Z on 2019/5/15.
 */
public class ClimbStairs {
    public static int climbStairs(int n) {
        return climb2(0,n);
    }

    public static int climb2(int i, int n){
        if(i > n){
            return 0;
        }
        if(i == n){
            return 1;
        }
        return climb2(i +1, n) + climb2(i + 2, n);
    }

    public static int climbStairs3Steps(int n) {
        return climb3(0,n);
    }

    public static int climb3(int i, int n){
        if(i > n){
            return 0;
        }
        if(i == n){
            return 1;
        }
        return climb3(i +1, n) + climb3(i + 2, n) + climb3(i + 3, n);
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(10));
        System.out.println(climbStairs3Steps(10));
    }

}
