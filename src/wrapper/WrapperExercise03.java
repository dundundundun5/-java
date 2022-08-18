package wrapper;

public class WrapperExercise03 {
    public static void main(String[] args) {
        //1F
        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1 == i2);

        //2F
        Integer i3 = new Integer(128);
        Integer i4 = new Integer(128);
        System.out.println(i3 == i4);

        //3T
        Integer i5 = 127;
        Integer i6 = 127;
        System.out.println(i5 == i6);

        //4F
        Integer i7 = 128;
        Integer i8 = 128;
        System.out.println(i7 == i8);

        //5F
        Integer i9 = 127;
        Integer i10 = new Integer(127);
        System.out.println(i9 == i10);

        //6T 只要有基本类型，==判断的是值是否相等
        Integer i11 = 127;
        int i12 = 127;
        System.out.println(i11 == i12);

        //7F ？应是T，只要有基本类型，==判断的是值是否相等
        Integer i13 = 128;
        int i14 = 128;
        System.out.println(i13 == i14);
    }
}
