package 字符串;

import java.util.StringJoiner;

public class 替换空格 {
    public static void main(String[] args) {
        String a = "We are happy.";
        System.out.println(method1(a));
        System.out.println(method2(a));
    }
    static String method1(String a) {
        return a.replaceAll(" ", "%20");
    } // 将空格换成%20
    static String method2(String a) {
        // 利用split将字符串按照空格分开
        String b[] = a.split(" ");
        var c = new StringJoiner("%20"); // 在每个字符串之间加上%20
        for (String bb : b) {
            c.add(bb);
        }
        return c.toString();
    }
}
