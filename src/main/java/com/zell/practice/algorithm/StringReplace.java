package com.zell.practice.algorithm;

/**
 * Created by Z on 2019/5/16.
 */
public class StringReplace {
    public static String stringReplace(String str) {
        return str.replace(" ", "%20");
    }

    public static void main(String[] args) {
        System.out.println(StringReplace.stringReplace("1 2 3AAA   BBB"));
    }
}
