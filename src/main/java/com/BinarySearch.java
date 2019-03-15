package com;

public class BinarySearch {
    /**
     * @param key 要查找的值
     * @param a   要查找的数据
     * @return 如果找到, 则返回值所在下标, 否则返回-1
     */
    public static int rank(int key, int[] a) {
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (key < a[mid]) {
                right = mid - 1;
            } else if (key > a[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
