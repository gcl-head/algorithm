package 链表;

public class 快速删除链表节点 {
    static <T> void method1 (MyLink <T> a, MyLink<T>.Node b) {
        if (a.head == null || b == null) return; // 排除异常情况
        if (a.head == b) { // 删除头节点情况
            a.head = a.head.next;
            return;
        }
        var nextNode = b.next; // b的下一个节点
        if (nextNode == null) { // b是尾节点
            nextNode = a.head;
            while (nextNode.next != b) nextNode = nextNode.next; // 寻找b节点的前一个节点
            nextNode.next = null; // 删除节点
            return;
        }
        b.data = nextNode.data;
        b.next = nextNode.next;
        nextNode = null; // 建议垃圾回收
    }
    public static void main (String[] args) {
        MyLink <Integer> sample = new MyLink<>();
        sample.insert(1);
        sample.insert(2);
        sample.insert(3);
        var node = sample.head.next; // 要删除的节点
        method1(sample, node);
        从尾到头打印链表.method1(sample);
    }
}
