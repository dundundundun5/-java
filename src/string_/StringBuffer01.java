package string_;

public class StringBuffer01 {
    public static void main(String[] args) {
        //StringBuffer对象可以串行化
        //StringBuffer是final类不能被继承
        //在堆中存放字符串，而不是常量池，因为 char[] value不是final类型
        /**
         * StringBuffer对象的值可以不停更改，改变字符串无需更改对象引用的地址
         * 而String每次拼接都要创建新的字符串，效率低
         */
        StringBuffer stringBuffer = new StringBuffer("hello");
    }
}
