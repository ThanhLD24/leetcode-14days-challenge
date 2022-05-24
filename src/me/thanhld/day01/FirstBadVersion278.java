package me.thanhld.day01;

public class FirstBadVersion278 {
    public static boolean isBadVersion(int version) {
        return version >= 4;
    }

//    public static int firstBadVersion(int n) {
//        int l = 1;
//        int r = n;
//        while (l <= r) {
//            if (l == r)
//                return l;
//            int mid = l + (r - l) / 2;
//            boolean isMidBad = isBadVersion(mid);
//            boolean isMidRBad = isBadVersion(mid + 1);
//            boolean isMidLBad = isBadVersion(mid - 1);
//            if (!isMidLBad && isMidBad)
//                return mid == 1 ? 1 : mid;
//            if (isMidRBad && !isMidBad)
//                return mid == n ? mid : mid + 1;
//            if (!isMidBad) {
//                l = mid + 1;
//            } else
//                r = mid - 1;
//        }
//        return l;
//    }

    public static int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        while (l < r) {
            int mid = l + (r - l) / 2;
            boolean isMidBad = isBadVersion(mid);
            if (isMidBad) {
                r = mid;
            } else
                l = mid + 1;
        }
        return l;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }
}
