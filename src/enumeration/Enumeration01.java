package enumeration;

class Season1 {
    private String name;
    private String desc;

    public Season1(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
public class Enumeration01 {
    public static void main(String[] args) {
        //季节是固定值，不会有更多
        Season1 spring = new Season1("spring", "warm");
        Season1 summer = new Season1("summer", "hot");
        Season1 autumn = new Season1("autumn", "cool");
        Season1 winter = new Season1("winter", "cold");
        //普通类不能固定、有限地表示季节，从而引出枚举类
    }
}
