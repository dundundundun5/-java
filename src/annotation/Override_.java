package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Override_ {
    public static void main(String[] args) {

    }
}

class Father {
    public void fly() {
        System.out.println("Father fly...");
    }
}

class Son extends Father {
    @Override //编辑器会检查该方法是否真的重写了，如果的确重写了则编译通过，如果没有构成重写则编译错误
    public void fly() {
        System.out.println("Son fly...");
    }

}
//这是个注解类而不是接口
//@Target(ElementType.METHOD)
//@Retention(RetentionPolicy.SOURCE)
//public @interface Override {
//}

