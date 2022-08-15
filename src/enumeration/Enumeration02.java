package enumeration;
//自定义枚举
class Season2 {
    private String name;
    private String desc;
    //1.防止调用构造器
    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    //2。只允许获取，不允许修改
    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
    //3创建固定内部对象,必须全部大写
    public static final Season2 SPRING = new Season2("spring", "warm");
    public static final Season2 SUMMER = new Season2("summer", "hot");
    public static final Season2 AUTUMN = new Season2("autumn", "cool");
    public static final Season2 WINTER = new Season2("winter", "cold");
}
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season2.SPRING);
    }
}
