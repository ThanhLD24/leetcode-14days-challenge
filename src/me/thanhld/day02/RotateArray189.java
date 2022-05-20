package me.thanhld.day02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RotateArray189 {
    public static void rotate(int[] nums, int k) {
        List<Integer> _nums = Arrays.stream(nums).boxed().collect(Collectors.toList());
        if (k % nums.length != 0) {
            int minK = k % nums.length;
            List<Integer> _sub1 = _nums.subList(0, nums.length - minK);
            List<Integer> _sub2 = _nums.subList(nums.length - minK, nums.length);
            _sub2.addAll(_sub1);

            for (int i = 0; i < k; i++) {
                int temp = nums[i];
                int tempik = nums[i + k];
                nums[i] = nums[i + k];
                nums[i+1] = temp;
                nums[i-k] =
            }
        }

    }

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int step = 9;
        rotate(input, step);
    }
}
