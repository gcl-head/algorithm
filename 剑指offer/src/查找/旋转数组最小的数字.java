package 查找;

import java.util.Arrays;

public class 旋转数组最小的数字 {
    static int method1 (int[] a) {
        if (a.length == 0) {
            System.out.println("Empty array!");
            return 0; // 空数组
        }
        int left = 0;
        int right = a.length-1;
        if (right-left <= 1) return a[right]; // 数组元素少于2返回结果
        int mid = (left+right)/2;
        if (a[left] == a[mid] && a[right] == a[mid]) {
            return findMin(Arrays.copyOfRange(a, left, right + 1)); // 三处元素大小相同转为普通排序
        }
        if (a[mid] >= a[left]) return method1(Arrays.copyOfRange(a, mid, right + 1)); // 最小值在右边
        if (a[mid] <= a[right]) return method1(Arrays.copyOfRange(a, left, mid + 1)); // 最小值在左边
        System.out.println("Unknwon error!");
        return -1;
    }
    static int findMin (int[] a) {
        // 顺序查找最小值
        int min = a[0];
        for(int i = 1; i < a.length; i++) {
            if (a[i] < min) min = a[i];
        }
        return min;
    }
    public static void main (String[] args) {
        int[] sample = {3, 4, 5, 6, 1, 1, 2, 3}; // 输入数组
        System.out.println(method1(sample));
    }
}
