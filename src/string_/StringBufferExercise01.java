package string_;

public class StringBufferExercise01 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer sb = new StringBuffer();//ok
        sb.append(str);//AbstractStringBuilder.appendNull()
        System.out.println(sb.length());//4
        System.out.println(sb);//null
        try {
            //构造器调用str.length()报异常
            StringBuffer sb1 = new StringBuffer(str);
            System.out.println(sb1);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }
}
