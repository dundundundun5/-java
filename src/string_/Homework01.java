package string_;

import java.util.Arrays;

public class Homework01 {
    /**
     *
     * @param str 反转字符串
     * @param start 开始反转索引
     * @param end 结束反转索引
     * @return
     */
    public static String reverse(String str, int start, int end) {
        /*
        StringBuilder mid = new StringBuilder("");
        StringBuilder res = new StringBuilder("");
        for(int i = end; i >= start; i--)
            mid.append(str.charAt(i));
        for(int i = 0; i < start; i++)
            res.append(str.charAt(i));
        res.append(mid);
        for (int i = end + 1; i < str.length(); i++)
            res.append(str.charAt(i));
        return res.toString();*/
        /*
        StringBuilder res = new StringBuilder(str);
        while (start < end) {
            Character st = str.charAt(start);
            Character ed = str.charAt(end);
            res.replace(start, start + 1, ed.toString());
            res.replace(end, end + 1, st.toString());
            start++;end--;
        }
        return res.toString();
        */
        //条件判断保证算法的稳定性
        char[] chars = str.toCharArray();
        while(start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;end--;
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        System.out.println(reverse("abcdef", 1, 4));
    }
}
