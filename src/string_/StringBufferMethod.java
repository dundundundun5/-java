package string_;

public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("hello");
        s.append(",");
        s.append("cao");
        s.append("ni").append("ma").append("1").append("de");
        System.out.println(s);

        //删除[1, 6)的字符
        s.delete(1, 6);
        System.out.println(s);
        //替换[1, 3)的字符并替换为任意长度的字符
        s.replace(1, 3, "fky");
        //在序号为4的位置插入一个字符串
        s.insert(2, "byd");
    }
}
