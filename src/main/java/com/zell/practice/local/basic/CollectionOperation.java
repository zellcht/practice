package com.zell.practice.local.basic;

import java.util.HashSet;

/**
 * Created by Z on 2019/5/24.
 */
public class CollectionOperation {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        set1.add("a");
        set1.add("b");
        set1.add("c");

        set2.add("c");
        set2.add("d");
        set2.add("e");

        set1.addAll(set2);
        set1.retainAll(set2);
        set1.removeAll(set2);


    }
}
