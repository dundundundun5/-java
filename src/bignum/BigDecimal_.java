package bignum;

import java.math.BigDecimal;

public class BigDecimal_ {
    public static void main(String[] args) {
        double d = 1.999d;
        System.out.println(d);
        BigDecimal bigDecimal = new BigDecimal("1.9999999999999999888888888888");
        //对BigDecimal运算需要调用相应的方法，方法名还是四种符号的英文
        //除法可能抛出异常，除不尽
        //z在调用divide方法时指定精度即可
        BigDecimal bigDecimal1 = new BigDecimal("0.776787");
        //但是已经被11弃用了
        System.out.println(bigDecimal.divide(bigDecimal1, 2));
    }
}
