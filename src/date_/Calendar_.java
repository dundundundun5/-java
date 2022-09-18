package date_;
import java.util.*;
public class Calendar_ {
    public static void main(String[] args) {
        //Calendar
        //是一个抽象类，并且构造器是私有化的
        //可以通过getInstance()来获取实例
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println("年：" + c.get(Calendar.YEAR));
        //月是从0开始算的，所以要+1
        System.out.println("月：" + (c.get(Calendar.MONTH) + 1));
        //同理 DAY_OF_MONTH HOUR(12) MINUTE SECOND HOUR_OF_DAY(24)
        //没有提供格式化的组合时间显示，所以需要自己组合
    }
}
