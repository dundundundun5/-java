package set_;
import java.util.*;
public class HashSet_ {
    public static void main(String[] args) {
        //HashSet无序，底层是HashMap
        HashSet hashSet = new HashSet();
        hashSet.add("lucy");
        hashSet.add("lucy");
        hashSet.add(new Dog("Tom"));
        // 如果Dog没有重写Hashcode和equals方法，那么只比较对象相等
        // 重写了以后，只比较name是否相等，则这个Dog无法加入HashSet
        hashSet.add(new Dog("Tom"));
        System.out.println("set=" +  hashSet);

        //看源码，add()到底发生了什么
//        hashSet.add(new String("hsp"));//ok
//        hashSet.add(new String("hsp"));//not ok
//
//        System.out.println("set=" +  hashSet);
    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
