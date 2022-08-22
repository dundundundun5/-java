package string_;

public class StringExercise01 {


    public static void main(String[] args) {
        String a = "abc";
        //常量池中已经有abc，所以引用b指向常量a
        String b = "abc";
        System.out.println(a.equals(b));
        System.out.println(a == b);
    }
}
