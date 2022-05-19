package me.thanhld.day01;

import java.util.List;

public class SearchInsertPosition35 {
    public static int searchInsert(int[] nums, int target) {
        int size = nums.length;
        int start = 0;
        int end = size - 1;
        while (true) {
            if (start >= end) {
                if (nums[start] == target)
                    return start;
                else {
                    return nums[start] > target ? start : start + 1;
                }

            }
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] > target) {
                if (mid == 0)
                    return 0;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {3, 5, 7, 9, 10};
//        int[] arr = new int[] {1,3};
        int target = 8;
        System.out.println(searchInsert(arr, target));
    }
}
