package list_;
import java.util.*;
public class LinkedListCRUD {
    public static void main(String[] args) {
        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        //remove()溢出一个头部节点
        // 移除流程无非就是数据结构的知识。
        linkedList.remove();
        //修改某个结点对象
        linkedList.set(1, 999);
        //得到某个结点对象
        System.out.println(linkedList.get(1));
        System.out.println(linkedList);
        /**
         *  初始化就是建立空的表 first=last=null
         */
    }
}
