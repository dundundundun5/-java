package string_;

//StringBuilder不是线程安全的，用在字符串缓冲区被单个线程使用
public class StringBuilder01 {
    public static void main(String[] args) {
        /**
         * 实现了serializable接口，对象可串行化
         * <br>属于final不可被继承的类，对象的字符序列存放于 byte[] value;
         * <br>所有方法没有作互斥的处理，仅仅在单线程使用
         */
        StringBuilder stringBuilder = new StringBuilder();

    }
}
