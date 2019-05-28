package com.zell.practice.local.algorithm;

/**
 * Created by Z on 2019/5/16.
 */
public class StringReplace {
    public static String stringReplace(String str) {
        return str.replace(" ", "%20");
    }

    public static int count(String str) {
        if (str == null || str.length( ) == 0) {
            return 0;
        }
        if (str.charAt(0) == 'A') {
            return count(str.substring(1)) + 1;
        }
        return count(str.substring(1));
    }
    public static void main(String[] args) {
        System.out.println(StringReplace.stringReplace("1 2 3AAA   BBB"));
        System.out.println(StringReplace.count("1 2 3AAA   BBB"));
    }
}
