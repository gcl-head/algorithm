package 查找;

public class 数字在排序数组中出现的次数 {
    static int method1 (int[] a, int b) {
        int index = findBoundary(a, b);
        if (index == -1) return -1; // a中无b
        int left = index;
        int right = index;
        while(a[left] == b) left--; // 寻找左边界
        while(a[right] == b) right++; // 寻找右边界
        return right - left - 1;
    }
    static int findBoundary (int[] a, int b) {
        // 二分查找b在a中的位置
        if (a.length == 0) return -1; // 空数组
        int left = 0;
        int right = a.length - 1;
        int mid = -1;
        while (left < right) {
            mid = (left + right) / 2;
            if (a[mid] == b) return mid; // bingo
            if (a[mid] < b) { // b在右边
                left = mid + 1;
            } else right = mid - 1; // b在左边
        }
        if (a[left] == b) return left; // left==right
        return -1; // a中无b
    }
    public static void main (String[] args) {
        int[] sample = {1, 2, 3, 3, 3, 4, 4, 5}; // 输入数组
        System.out.println(method1(sample, 2));
    }
}
