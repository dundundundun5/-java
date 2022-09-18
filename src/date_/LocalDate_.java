package date_;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class LocalDate_ {
    public static void main(String[] args) {
        //now()返回当前日期的时间
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        //get方法能单独提取日期时间
        System.out.println("year: " + ldt.getYear());
        System.out.println("month: " + ldt.getMonth());
        System.out.println("month: " + ldt.getMonthValue());
        System.out.println("day: " + ldt.getDayOfMonth());
        //设置Local输出格式
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH小时mm分钟ss秒");
        String format = dateTimeFormatter.format(ldt);
        System.out.println(format);
        //提供plus minus 方法对当前时间进行加和减
        LocalDateTime localDateTime = ldt.plusDays(800);
        System.out.println(dateTimeFormatter.format(localDateTime));
        //345分钟前的日期
        LocalDateTime localDateTime1 = ldt.minusMinutes(345);
        System.out.println(dateTimeFormatter.format(localDateTime1));

    }
}
