package set_;

import java.util.Properties;

public class Properties_ {
    public static void main(String[] args) {
        Properties properties = new Properties();
        //可以通过键值对存放数据，键值均不能为空
        properties.put("john", 100);
        properties.put("lucy", 100);
        properties.put("lic", 100);
        properties.put("lic", 88);//有相同的key，值也会被替换
        System.out.println(properties);

        //通过key获取value
        System.out.println(properties.get("lic"));//88
        //删除
        properties.remove("lic");
        System.out.println(properties);

        //修改
        properties.put("john", "caonima");
        System.out.println(properties);
    }
}
