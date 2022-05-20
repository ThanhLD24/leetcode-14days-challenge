package me.thanhld.day02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RotateArray189 {
    public static void rotate(int[] nums, int k) {
        int[] copy = nums.clone();
        if (k % nums.length != 0) {
            int minK = k % nums.length;
            for (int i = 0; i < copy.length; i++) {
                if (i < minK) {
                    nums[i] = copy[copy.length - minK + i];
                } else {
                    nums[i] = copy[i - minK];
                }
            }
            System.out.println(Arrays.toString(nums));
        }
    }

    public static void anotherRotateSolution(int[] nums, int k) {
        k = k % nums.length;
        r(nums, 0, nums.length - 1);
        r(nums, 0, k - 1);
        r(nums, k, nums.length - 1);


    }

    public static void r(int[] n, int s, int e) {
        int a = s, b = e;
        int t = -1;

        // revert array
        while (a < b) {
            t = n[a];
            n[a] = n[b];
            n[b] = t;
            a++;
            b--;
        }
    }

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};
        int step = 3;
//        rotate(input, step);
        anotherRotateSolution(input, step);
    }
}
