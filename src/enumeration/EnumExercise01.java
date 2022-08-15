package enumeration;
//下面的代码会输出？
public class EnumExercise01 {


    public static void main(String[] args) {
        //引用->Gender2.BOY
        Gender2 boy = Gender2.BOY;
        Gender2 boy2 = Gender2.BOY;
        //调用父类Enum的toString()
        System.out.println(boy);
        System.out.println(boy2 == boy);

    }
}

enum Gender2 {
    BOY, GIRL
}
