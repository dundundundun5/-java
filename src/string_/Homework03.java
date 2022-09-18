package string_;

import java.util.Locale;

public class Homework03 {

    public static void main(String[] args) {
        System.out.println(tackle("ni ma cao"));
    }
    public static String tackle(String str) {
        if(str == null)
            return null;
        String[] temp = str.split(" ");
        if (temp.length != 3)
            return null;

        return String.format("%s, %s. %c", temp[2], temp[0], temp[1].toUpperCase(Locale.ROOT).charAt(0));
    }
}
