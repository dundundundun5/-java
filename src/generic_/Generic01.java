package generic_;
import java.util.*;

/**
 * 传统方法，不能对加入到集合中的数据类型进行约束<br>
 *
 * 遍历的时候，需要进行类型转换，如果集合中的数据量大，对效率有影响
 */
public class Generic01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("旺财", 10));
        arrayList.add(new Dog("发财", 1));
        arrayList.add(new Dog("1!5!", 24));
        //arrayList.add(1);//Exception
        for (Object o : arrayList) {
            Dog dog = (Dog)o;
            System.out.format("%s, %d\n", dog.getName(), dog.getAge());
        }

    }
}

class Dog {
    private String name;
    private int age;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

