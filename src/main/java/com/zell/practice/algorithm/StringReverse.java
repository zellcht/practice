package com.zell.practice.algorithm;

public class StringReverse {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            result += reverseString(words[i].toCharArray());
            if(i == words.length - 1){
                continue;
            }
            result += " ";
        }
        return result;
    }
    public static String reverseString(char[] s) {
        int start = 0;
        int end = s.length -1;
        while(start < end){
            swap(s, start, end);
            start++;
            end--;
        }
        return String.valueOf(s);
    }
    public static void swap(char[] s, int start, int end){
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
    }

    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        System.out.println(reverseWords(str));
    }
}
