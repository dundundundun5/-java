package wrapper;

public class Integer01 {
    public static void main(String[] args) {
        //装箱拆箱的演示
        //手动装箱
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);

        //手动拆箱
        int i = integer.intValue();

        //jdk5后可以自动装箱
        int n2 = 200;
        Integer integer2 = n2;//底层使用的是valueOf()
        //且自动拆箱
        int n3 = integer2;
    }
}
