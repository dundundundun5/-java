package string_;

public class StringExercise03 {


    public static void main(String[] args) {
        String a = "hsp";
        String b = new String("hsp");
        System.out.println(a.equals(b));//T
        System.out.println(a == b);//F
        System.out.println(a == b.intern());//T返回b指向字符串在常量池的地址
        System.out.println(b == b.intern());//Fb对象堆的地址不等于字符串在常量池的地址
    }
}
