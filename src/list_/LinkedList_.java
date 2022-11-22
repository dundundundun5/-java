package list_;

public class LinkedList_ {
    public static void main(String[] args) {

    }
}

//定义一个Node类，表示双向链表的一个结点
class Node {
    public Object item;
    public Node next;//指向下一个结点
    public Node pre;//指向前一个结点
    public Node(Object name) {
        this.item = name;
    }
    public String toString() {
        return "Node name=" + item;
    }
}

