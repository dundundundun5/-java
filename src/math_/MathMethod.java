package math_;

public class MathMethod {
    public static void main(String[] args) {
        int abs = Math.abs(-9);
        double pow = Math.pow(2, 4);
        //向上取整
        double ceil = Math.ceil(-3.001);
        //向下取整
        double floor = Math.floor(-4.99);
        //四舍五入
        long round = Math.round(-5.5);
        //算术平方根
        double sqrt = Math.sqrt(9.0);
        //返回[0, 1)的随机数
        double random = Math.random();
        //利用区间偏移法返回[2,7]
        int random2 = (int) (2 + 6 * Math.random());
    }
}
