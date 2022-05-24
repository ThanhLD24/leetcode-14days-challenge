package me.thanhld.day03;

import java.util.Arrays;

public class TwoSumII167 {

    public static int[] twoSum(int[] numbers, int target) {
        int s = 0;
        int e = numbers.length - 1;
        boolean found = false;
        int mid = s + (e - s) / 2;
        if (numbers[mid] > target)
            e = mid;
        while (!found) {
            if (numbers[s] + numbers[e] == target)
                found = true;
            else if (numbers[s] + numbers[e] > target)
                e--;
            else
                s++;
        }
        return new int[]{s + 1, e + 1};
    }

    public static void main(String[] args) {
//        int[] input = new int[]{2, 7, 11, 15};
//        int target = 9;

        int[] input = new int[]{2, 3, 4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(input, target)));
    }
}
