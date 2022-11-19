package list_;
import java.util.*;
/**JDK8
 * ArrayList中维护一个transient Object数组elementData
 * transient属性不会被序列化
 * 如果用无参构造器创建ArrayList对象，则初始数组容量为0
 * 第一次添加时数组扩容为10，如果需要再次扩容，则扩展为1.5倍
 * 如果传入指定大小的参数，则第一次扩容就扩至1.5倍
 */
public class ArrayListSource {
    public static void main(String[] args) {
        //使用无参构造器
        /**
         * public ArrayList() {
         *         this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
         *     }
         */
        ArrayList arrayList = new ArrayList(8);
        //使用for给list集合添加1-10数据
        //使用扩容机制，来决定是否扩容，以及扩容多大
        /**巧妙地位运算， 每一次扩容都是copyOf，保留之前的数据后扩容
         *  int newCapacity = oldCapacity + (oldCapacity >> 1);
         *         if (newCapacity - minCapacity <= 0) {
         *             if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA)
         *                 return Math.max(DEFAULT_CAPACITY, minCapacity);
         */
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }
        //使用for给list添加数据
        for (int i = 11; i <= 15; i++) {
            arrayList.add(i);
        }
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(null);
    }
}
