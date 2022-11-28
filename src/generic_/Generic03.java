package generic_;
import java.util.*;

public class Generic03 {
    public static void main(String[] args) {
        Person<String> person = new Person<String>("hsp");
    }
}
//泛型的作用是，可以在类声明时通过一个标识表示类中某个属性的类型，
//或者时某个方法的返回值的类型，或者是参数类型
class Person<E> {
    E s;//E表示s的数据类型，该数据类型在定义Person的时候指定的
    //在编译期间就确定E是什么类型
    public Person(E s) {//E也可以是参数类型
        this.s = s;
    }

    public E f() {//返回类型使用E
        return s;
    }
}
