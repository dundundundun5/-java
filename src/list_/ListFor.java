package list_;
import java.util.*;
/**
 * list遍历
 * 1. 使用迭代器
 * 2. 增强for
 * 3. 普通for
 */
public class ListFor {
    public static void main(String[] args) {
        //list实现子类 LinkedList Vector
        List list = new ArrayList();
        list.add("jack");
        list.add("晋江人是");
        list.add("dawkd");
        list.add(1);
        // 迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        // 增强for
        for (Object o : list) {
            System.out.println(o);
        }
        //普通for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
