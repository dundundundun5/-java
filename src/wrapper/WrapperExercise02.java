package wrapper;

public class WrapperExercise02 {
    public static void method1() {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);//判断对象是否相等
//        public static Integer valueOf(int i) {
//            if (i >= Integer.IntegerCache.low && i <= Integer.IntegerCache.high)
//                return Integer.IntegerCache.cache[i + (-Integer.IntegerCache.low)];
//            return new Integer(i);
//        }
        //参考底层Integer.valueOf()
        //-128 ~ 127会从IntegerCache取现有对象而不是新建对象
        //所以是同一个对象
        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);

        //不在范围之内，所以是new
        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);
    }

    public static void main(String[] args) {
        method1();
    }
}
