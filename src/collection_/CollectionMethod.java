package collection_;

import java.util.*;

public class CollectionMethod {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        /** 方法
         * add
         * remove
         * contains
         * size
         * isEmpty
         * clear
         * addAll
         * containsAll
         * removeAll
         */
        List list = new ArrayList();
        list.add("jack");
        list.add(10);
        list.add(true);
        System.out.println("list=" + list);
        list.remove("jack");
        System.out.println(list.contains(true));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.addAll(Arrays.asList(1, "红楼梦", 2));
        System.out.println("list=" + list);
        System.out.println(list.containsAll(Arrays.asList(10, 1, 2)));
        list.removeAll(Arrays.asList(10, 1, 2));
        System.out.println("list=" + list);
    }
}
