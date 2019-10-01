package 链表;

public class MyLink <T> {
    public Node head = null; // 头节点
    class Node {
        public Node next = null; // next节点
        public T data; // 节点内容
        public Node (T data) {
            this.data = data;
        }
    }
    public void insert (T data) {
        // 插入新节点
        var newNode = new Node(data); // 实例化新节点
        if (this.head == null) {
            this.head = newNode; // 空链表情况
            return;
        }
        var tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = newNode; // 遍历到空节点，并将新节点连上
    }
}
