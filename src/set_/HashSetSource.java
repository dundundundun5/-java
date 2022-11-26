package set_;
import java.util.*;

/**
 * 1. HashSet的底层是HashMap，但不同的是HashSet的键值（valud）永远是PRESENT=new Object()<br>
 * 2. 数据结构是数组，数组里每个元素都是具备键值对和索引值的双向链表（邻接表是为了解决哈希地址冲突）<br>
 * 3. 初始数组大小为16，每次装填因子到达0.75（12个位置铀元素），就扩容2倍<br>
 * 4. 扩容的边界条件：已经挂在8个结点且扩容至64 结果是：将已经挂载8个结点的双向链表转化为红黑树<br>
 * 4.1 当已经挂载8个结点，但未扩容至64时，加入第9个结点会导致扩容2倍，
 * 加入第十个会再次扩容2倍，直到满足边界条件从而树化<br>
 * 4.2 只要加入一个结点，size就会++，到了装填因子后就会扩容，不论结点是否在同一索引值<br>
 * 5. 装填时，先看hashcode转成的hash值落在数组的位置，要么放入要么挂载，判断条件为equals()（非红黑树情况）
 */
public class HashSetSource {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("ack");
        set.add("bck");
        set.add("ack");
    }
}
