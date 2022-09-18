package date_;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Date01 {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();//获取当前系统时间
        System.out.println(d1);//默认输出格式时国外的方式
        Date d2 = new Date(2992);//通过毫秒数来指定时间，距离1970-01-01的毫秒数
        System.out.println(d2);
        //可以指定相应的格式，且此处的字母是规定好的，参见SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = sdf.format(d1);
        System.out.println(format);
        //日期显示格式转换，可以按中国形式输出日期
        String s = "2022年09月17日 03:53:20 周六";
        Date parse = sdf.parse(s);
        System.out.println(parse);
    }

}
