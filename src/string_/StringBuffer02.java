package string_;

public class StringBuffer02 {
    /**
     * use of constructor
     *
     */
    public static void main(String[] args) {
        //创建一个大小为16的字符串缓冲区
        StringBuffer stringBuffer = new StringBuffer();
        //通过构造器指定char[]的大小
        StringBuffer stringBuffer1 = new StringBuffer(100);
        //通过给一个String创造StringBuffer，char数组大小为当前长度+16的长度
        StringBuffer stringBuffer2 = new StringBuffer("hello");
    }

}
