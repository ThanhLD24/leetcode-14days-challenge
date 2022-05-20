package me.thanhld.day3;

import java.util.Arrays;

public class MoveZeroes283 {
    public static void moveZeroes(int[] nums) {
        int i = 0;
        int j = 1;
        while (i < nums.length && j < nums.length) {
            if (nums[j] != 0) {
                if (nums[i] == 0) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
                i++;
                j++;
            } else if (nums[j] == 0) {
                if (nums[i] != 0)
                    i++;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroesUseLoop(int[] nums) {
        int[] output = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                output[j] = nums[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(output));
    }

    public static void main(String[] args) {
        int[] input = new int[]{0, 1, 2, 4, 0, 3, 12};
//        moveZeroes(input);
        moveZeroesUseLoop(input);
    }
}
