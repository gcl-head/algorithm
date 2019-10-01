package 链表;

import java.util.Stack;

public class 从尾到头打印链表 {
    static <T> void method1 (MyLink <T> a) {
        if (a.head == null) {
            System.out.println("链表为空");
            return;
        }
        var tmp = a.head;
        Stack <T> re = new Stack<>();
        while (tmp != null) {
            re.push(tmp.data);
            tmp = tmp.next;
        }
        while (!re.empty()) {
            System.out.println(re.pop());
        }
    }
    public static void main (String[] args) {
        MyLink<Integer> a = new MyLink<>();
        a.insert(1);
        a.insert(2);
        a.insert(3);
        a.insert(3);
        a.insert(3);
        method1(a);

    }
}
