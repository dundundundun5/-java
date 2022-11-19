package list_;
import java.util.*;
public class ArrayListDetail {
    public static void main(String[] args) {
        /**
         * ArrayList是线程不安全的，没有关键字synchronize
         * private void add(E e, Object[] elementData, int s) {
         *         if (s == elementData.length)
         *             elementData = grow();
         *         elementData[s] = e;
         *         size = s + 1;
         *     }
         */
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add("jcak");
        arrayList.add(null);
        System.out.println(arrayList);

    }
}
