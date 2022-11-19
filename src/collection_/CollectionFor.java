package collection_;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFor {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三国演义","罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));
        //使用增强for循环
        //1. 底层还是迭代器
        //2. 就是简化版本的迭代器遍历
        //快捷方式 I   col.for
        for(Object book: col) {
            System.out.println("book="+book);
        }
        //增强for也可以应用在数组上
//        int[] num = {1, 2, 3, 5};
//        for (int x: num)
//            System.out.println(x);
    }
}
