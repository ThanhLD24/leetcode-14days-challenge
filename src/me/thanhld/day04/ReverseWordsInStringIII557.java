package me.thanhld.day04;

public class ReverseWordsInStringIII557 {
//    public static String reverseWords(String s) {
//        String[] arr = s.split(" ");
//        for (int i = 0; i < arr.length; i++) {
//            char[] chars = arr[i].toCharArray();
//            reverseString(chars);
//            arr[i] = String.valueOf(chars);
//        }
//        return String.join(" ", arr);
//    }

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

    public static void reverseString(String[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            String temp = s[end];
            s[end] = s[start];
            s[start] = temp;
            start++;
            end--;
        }
    }


    public static String reverseWords(String s) {
        char[] arr = s.toCharArray();
        reverseString(arr);
        s = String.valueOf(arr);
        String[] output = s.split(" ");
        reverseString(output);
        return String.join(" ", output);
    }


    public static void main(String[] args) {
        String input = "Let's take LeetCode contest";
        System.out.println(reverseWords(input));
    }
}
