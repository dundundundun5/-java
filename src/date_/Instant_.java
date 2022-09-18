package date_;

import java.time.Instant;
import java.util.Date;

public class Instant_ {
    public static void main(String[] args) {
        //静态方法获取当前时间戳
        Instant now = Instant.now();
        //通过from()方法把Instant转为Date
        Date date = Date.from(now);
        //通过toInstant()反向转换
        Instant instant = date.toInstant();
    }
}
