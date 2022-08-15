package annotation;

import java.util.*;

public class SuppressWarnings_ {
    //当我们不希望看到这些警告时，要使用SuppressWarnings注解来抑制警告信息
    //在{}可以写入你希望抑制的信息unused, unchecked
    //作用范围和放置的位置相关，类定义的作用范围、方法定义的作用范围、成员变量的定义处。
    @SuppressWarnings({"rawtypes", "unchecked", "unused"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("");
        list.add("");
        list.add("");
        int i;
        System.out.println(list.get(1));
    }
}
