package string_;

import java.util.Arrays;

public class Homework04 {
    public static void main(String[] args) {
        String str = "a19idnm129D9AIKD";
       int[] cnt = new int[3];
        Arrays.fill(cnt, 0);
        char[] temp = str.toCharArray();
        for(char c : temp){
            if (Character.isDigit(c))
                cnt[2]++;
            if (Character.isAlphabetic(c) && Character.isUpperCase(c))
                cnt[1]++;
            if (Character.isAlphabetic(c) && Character.isLowerCase(c))
                cnt[0]++;
        }
        System.out.println(Arrays.toString(cnt));
    }
}
