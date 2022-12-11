package set_;
import java.util.*;
//键值对\值的遍历方法
public class HashMapTraverse {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("haha", 114);
        map.put("hehe", 514);
        map.put("xixi", 123213);
        map.put("gaga", 142857);

        //第一种，取键值
        Set<String> strings = map.keySet();
        for (String s: strings)
            System.out.println(s + "-" + map.get(s));
        //第二种，取Map.Entry<>
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for(Map.Entry<String, Integer> entry: set)
            System.out.println(entry.getKey() + "--" + entry.getValue());
        //第三种，使用键值的iterator
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String next =  iterator.next();
            System.out.println(next + "---" + map.get(next));
        }
        //第四种，使用Map.Entry的iterator
        Iterator<Map.Entry<String, Integer>> iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, Integer> next =  iterator1.next();
            System.out.println(next.getKey() + "----" + next.getValue());
        }
        //直接获取所有值
        System.out.println(map.values());
    }
}
