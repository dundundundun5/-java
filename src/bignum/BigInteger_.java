package bignum;

import java.math.BigInteger;

public class BigInteger_ {
    public static void main(String[] args) {
        long l = 236999999999999L;
        System.out.println(l);
        BigInteger bigInteger = new BigInteger("29999999999999999999999999999999999999999999");
        System.out.println(bigInteger);
        //在对BigInteger进行加减乘除时要使用对应的方法，不能直接用数学符号
        BigInteger add = bigInteger.add(bigInteger);
        BigInteger subtract = bigInteger.subtract(bigInteger);
        BigInteger multiply = bigInteger.multiply(bigInteger);
        BigInteger divide = bigInteger.divide(bigInteger);

    }
}
