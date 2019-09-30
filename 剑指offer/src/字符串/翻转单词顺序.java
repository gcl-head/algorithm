package 字符串;
import java.util.StringJoiner;

public class 翻转单词顺序 {
    public static void main(String[] args) {
        String sample = "I am a student."; // 输入字符串
        System.out.println(method1(sample));
    }
    static String method1(String a) {
        String[] aa = a.split(" "); // 将输入字符串根据空格分组
        var reversedA = new StringJoiner(" ");
        for (int i = aa.length-1; i>=0; i--) {
            reversedA.add(aa[i]);
        }
        return reversedA.toString();
    }
}
