package me.thanhld.day02;

import java.util.Arrays;

public class SquaresOfSortedArray977 {
    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;
        int index = end;
        while (start <= end) {
            int n1 = nums[start] * nums[start];
            int n2 = nums[end] * nums[end];
            if (n1 > n2) {
                result[index] = n1;
                start++;
            } else {
                result[index] = n2;
                end--;
            }
            index--;
        }
        return result;
    }


    public static void main(String[] args) {
        int[] input = new int[]{-4, -1, 0, 3, 10};
        int[] output = sortedSquares(input);
        System.out.println(Arrays.toString(output));
    }
}
