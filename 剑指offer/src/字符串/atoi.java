package 字符串;

public class atoi {
    static final int INT_MAX = Integer.MAX_VALUE; // 最大值
    static final int INT_MIN = Integer.MIN_VALUE; // 最小值
    static boolean isPlus = true; // 是否为正数
    static boolean isSymble(char a) {
        // 判断是否为正负号
        return a=='+' || a=='-';
    }
    static boolean isNum(char a) {
        // 判断是否为数字
        return a>='0' && a<='9';
    }
    static int atoi(String a) {
        // 转换字符串为整数
        String[] aToArray = a.split(" ");
        if (aToArray.length==0) return 0;
        int i = 0;
        for (; i<aToArray.length; i++) {
            if(aToArray[i].length()>0) break;
        }
        if (i==aToArray.length) return 0; // 排除空输入的情况
        char[] aa = aToArray[i].toCharArray(); // 排除首尾空格和多余字符串
        i = 0;
        if (isSymble(aa[0])) {
            isPlus = aa[0]=='+';
            i += 1;
        }
        else if (isNum(aa[0])) {
            isPlus = true;
        }
        else return 0;
        long re = 0; // 返回的数字
        for(;i<aa.length; i++) {
            if (!isNum(aa[i])) break; //排除字符串中有非数字的异常情况
            if (isPlus) re = re*10+aa[i]-'0';
            else re = re*10-aa[i]+'0';
            if (re>INT_MAX) return INT_MAX;
            if (re<INT_MIN) return INT_MIN;
        }
        return (int)re;
    }
    public static void main(String[] args) {
        String a = "9223372036854775808"; // 输入字符串
        System.out.println(atoi(a));
    }
}
