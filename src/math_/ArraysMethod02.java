package math_;

import java.util.*;

public class ArraysMethod02 {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 90, 123, 567};
        //数组必须有序
        int index = Arrays.binarySearch(integers, 1);//二叉查找
        //如果不存在，则返回数字应该在的位置+1 取负数 return -(low + 1);  // key not found.
        System.out.println(index);
        //复制老数组的x个元素到新数组中，如果x大于老数组长度，则在新数组后加同等数量的null
        Integer[] integers1 = Arrays.copyOf(integers, integers.length);
        System.out.println(Arrays.toString(integers1));
        //数组填充，把原来的所有元素替换为一个数
        Integer[] num = new Integer[]{1, 2, 3};
        Arrays.fill(num, 99);
        System.out.println(Arrays.toString(num));
        //判断数组是否完全一样
        System.out.println(Arrays.equals(integers, integers1));
        //将一组值\数组转化为List
        //asList编译类型是List 运行时类型是Arrays的静态内部类ArrayList
        List<Integer> asList = Arrays.asList(num);
    }
}
