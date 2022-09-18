package string_;

import java.util.regex.Pattern;

public class Homework02 {
    public static void main(String[] args) {

    }
}

class Info {
    String name;
    String pw;
    String mail;
    private Info() {}

    private Info(String name, String pw, String mail) {
        this.name = name;
        this.pw = pw;
        this.mail = mail;
    }

    public static Info reg(String name, String pw, String mail) throws UnsupportedOperationException {
        boolean flag = true;
        Pattern p = Pattern.compile("\\D");
        if (name.length() < 2 || name.length() > 4) {
            System.out.println("用户名长度为2、3、4");
            flag = false;
        }

        if (p.matcher(pw).matches() || pw.length() != 6) {
            System.out.println("密码必须为全数字且长度为6");
            flag = false;
        }
        p = Pattern.compile("[@].*[.]");
        if (!p.matcher(mail).matches()) {
            System.out.println("邮箱必须包含@和.，@必须在.的前面");
            flag = false;
        }
        if (flag)
            return new Info(name, pw, mail);
        else
            throw new UnsupportedOperationException("不符合要求");
    }
}
