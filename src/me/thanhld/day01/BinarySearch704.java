package me.thanhld.day01;

public class BinarySearch704 {
    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] input = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 2;
//        int[] input = new int[]{5};
//        int target = 5;
        System.out.println(search(input, target));
    }
}
