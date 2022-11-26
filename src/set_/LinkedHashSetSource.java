package set_;
import java.util.*;

/**
 * 和HashSet最大区别是插入顺序等于遍历顺序
 * 底层是一个LinkedHashMap维护了一个双向链表
 * 第一次添加，table直接扩容到16，table里存放的是Entry对象
 * Entry继承了Node，还添加了before和after两个指针，继承关系实在内部类完成的
 */
public class LinkedHashSetSource {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add(new String("hsp"));
        set.add(456);
        set.add(456);
        set.add(new A(2));
        set.add(123);
    }
}
