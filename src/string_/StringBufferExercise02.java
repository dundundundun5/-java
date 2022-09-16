package string_;

public class StringBufferExercise02 {
    /**
     * 给定商品价格xxxxx.xx
     * 把小数点前的数字每3位用逗号分隔
     * @param args
     */
    public static void main(String[] args) {
        String price = "131231231234567.8910";
        StringBuffer stringBuffer = new StringBuffer(price);

        //int i = stringBuffer.lastIndexOf(".");
        //stringBuffer = stringBuffer.insert(i - 3, ",")
        for(int i = stringBuffer.lastIndexOf(".") - 3; i > 0; i -= 3)
            stringBuffer = stringBuffer.insert(i    , ",");
        System.out.println(stringBuffer);
    }
}
