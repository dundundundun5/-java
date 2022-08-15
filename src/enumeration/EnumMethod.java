package enumeration;

/**
 * 演示Enum类的各种方法的值
 */
public class EnumMethod {
    public static void main(String[] args) {
        Season3 autumn = Season3.AUTUMN;
        //name()输出枚举对象的名字
        System.out.println(autumn.name());
        //ordinal()输出枚举对象的次序，从0开始
        System.out.println(autumn.ordinal());
        //values()返回枚举类对象数组
        Season3[] values = Season3.values();
        for (Season3 value : values)
            System.out.print(value + " ");//间接调用toString()
        System.out.println();
        //valueOf(String) 必须是已经有的枚举名
        try {
            Season3 autumn2 = Season3.valueOf("AUTUMN2");
            System.out.println(autumn2);
        } catch (IllegalArgumentException e) {
            System.out.println("乱他妈输");
        }
        //compareTo() return 前序号-后序号
        System.out.println(Season3.SPRING.compareTo(Season3.AUTUMN));

    }
}

