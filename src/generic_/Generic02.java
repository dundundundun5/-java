package generic_;
import java.util.*;
public class Generic02 {
    public static void main(String[] args) {
        /**
         * 当我们这样ArrayList<Dog>表示存放到集合中的类型是Dog类型<br>
         * 如果编译器发现添加的类型不满足要求，报错<br>
         * 遍历的时候，可以直接取出Dog而不是Object
         */
        ArrayList<Dog> arrayList = new ArrayList<Dog>();
        arrayList.add(new Dog("旺财", 10));
        arrayList.add(new Dog("发财", 1));
        arrayList.add(new Dog("1!5!", 24));
        for (Dog dog : arrayList) {
            System.out.println(dog.getName() + "-" + dog.getAge());
        }

    }
}
