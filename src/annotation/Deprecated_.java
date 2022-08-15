package annotation;

public class Deprecated_ {
    public static void main(String[] args) {
        A a = new A();
    }
}


/**
 * Deprecated表示一个元素已经过时，不推荐使用，但是用还是可以的
 * 可以用作版本升级过度使用
 */
@Deprecated
class A {
    public int n1 = 10;
    public void hi() {

    }
}