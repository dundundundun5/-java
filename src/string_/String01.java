package string_;

public class String01 {
    public static void main(String[] args) {
        //1保存字符序列
        //2unicode一个字符占两个字节
        //3构造器很多
        //4是final类不能被继承
        //5地址不可修改,但是地址里的值可以修改
        String name = "tom";
        name = "mary";
        final char[] value = {'a', 'b', 'c'};
        value[0] = 'm';
        char[] v2 = {'t', 'o', 'm'};
        //ERROR:value = v2;
    }
}
