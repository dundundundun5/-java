package set_;
import java.util.*;
public class TreeSet_ {
    public static void main(String[] args) {
        /**
         * 默认调用对象的compareTo方法，进行排序
         */
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o2).compareTo((String)o1);
            }
        });
        treeSet.add("abc");
        treeSet.add("dwoa");
        treeSet.add("z");
        treeSet.add("dkd");
        System.out.println(treeSet);

    }
}
