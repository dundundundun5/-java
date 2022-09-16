package string_;

public class StringAndStringBuffer {
    public static void main(String[] args) {
        //String->StringBuffer
        String str = "cao ni ma";
        //返回SB对象，对String对象毫无影响
        StringBuffer stringBuffer = new StringBuffer(str);
        //调用append()
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);
        //StringBuffer->String
        StringBuffer stringBuffer2 = new StringBuffer(str);
        //toString()
        String str2 = stringBuffer2.toString();
        //使用构造器
        String s = new String(stringBuffer2);
    }
}
