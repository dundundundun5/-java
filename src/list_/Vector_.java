package list_;
import java.util.*;
public class Vector_ {
    public static void main(String[] args) {
        /**
         * Vector是线程安全的
         * 在初始化函数中，未指定则默认+10容量，已指定则按指定大小
         * 后续扩容2倍数
         * 则后续扩容2倍数
         */
        Vector vector = new Vector();
        for (int i = 0; i < 11; i++) {
            vector.add(i);
        }
    }
}
