package set_;
import java.util.*;
public class HashSet_ {
    public static void main(String[] args) {
        //HashSet无序，底层是HashMap
        HashSet hashSet = new HashSet();
        hashSet.add("lucy");
        hashSet.add("lucy");
        hashSet.add(new Dog("Tom"));
        hashSet.add(new Dog("Tom"));
        System.out.println("set=" +  hashSet);

        //看源码，add()到底发生了什么
        hashSet.add(new String("hsp"));//ok
        hashSet.add(new String("hsp"));//not ok

        System.out.println("set=" +  hashSet);
    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }
}
