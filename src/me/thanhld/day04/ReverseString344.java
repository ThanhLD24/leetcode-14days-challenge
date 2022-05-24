package me.thanhld.day04;

import java.util.Arrays;

public class ReverseString344 {
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char temp = s[end];
            s[end] = s[start];
            s[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
//        char[] chars = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] chars = new char[]{'H','a','n','n','a','h'};
        reverseString(chars);
        System.out.println(Arrays.toString(chars));
    }
}
