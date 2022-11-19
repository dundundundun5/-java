package list_;
import java.util.*;
public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("zld");
        list.add("abc");
        //1. add()在固定索引插入一个对象
        list.add(1, "daw");
        System.out.println(list);
        //2. addAll()可以加入一组元素
        list.addAll(1, Arrays.asList(1, 2, 3));
        System.out.println(list);
        //3 indexOf()返回obj在集合中第一次出现的位置
        System.out.println(list.indexOf(3));
        //4. lastIndexOf()返回obj在集合中最后一次出现的位置
        list.add(3);
        System.out.println(list.indexOf(3));
        //5. remove()删除指定下标的元素
        list.remove(3);
        System.out.println(list);
        //6. set()将指定索引的元素替换成别的值
        list.set(1, "cao");
        System.out.println(list);
        //7. subset()返回区间内的子集 左闭右开
        System.out.println(list.subList(0, 2));
    }
}
