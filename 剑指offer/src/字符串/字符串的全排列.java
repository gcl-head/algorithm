package 字符串;

import java.util.HashSet;

public class 字符串的全排列 {
    public static void main(String[] args) {
        String test = "abbcccdddd";
        method1(test.toCharArray(), 0);
        System.out.println("result:"+result);
        System.out.println("length:"+result.size());
    }
    static HashSet<String> result = new HashSet<>();
    static char[] swap(char[] aa, int i, int j) {
        // 交换元素
        char[] a = aa.clone();
        char b = a[i];
        a[i] = a[j];
        a[j] = b;
        return a;
    }
    static void method1(char[] sample, int n) {
        // n表示当前交换元素下标
        int len = sample.length;
        if (n == len) {
            // 最后一个元素交换完记录结果
            result.add(new String(sample));
        }
        for (int i = n; i < len; i++) {
            // 将当前交换元素后的每个元素和当前元素进行交换
            method1(swap(sample, n, i), n+1);
        }
    }
}
