package enumeration;
/**
 * 使用enum替代class,语法为全大写常量名+构造器,无参构造器只需要常量名
 * 常量间使用逗号间隔
 * 常量必须写在最前面<br>
 * 反编译后发现
 * 枚举类默认继承Enum<CLASS>,而且是final类，还附加了额外的方法
 */
enum Season3 {
    SPRING("spring", "warm"),
    SUMMER("summer", "hot"),
    AUTUMN("autumn", "cool"),
    WINTER("winter","cold");
    private String name;
    private String desc;
    //1.防止调用构造器
    private Season3(String name, String desc) {
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

}
public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season3.SPRING.getDesc());
    }
}
