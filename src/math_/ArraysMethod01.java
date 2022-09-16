package math_;

import java.util.*;

public class ArraysMethod01 {
    public static void main(String[] args) {
        Integer[] integers = {1, 20 , 90};
        //显示数组的方法
        System.out.println(Arrays.toString(integers));
        //sort方法的使用，数组是引用类型，所以传参会直接影响到实参，默认从小到大
        Integer[] integers1 = {1, -1, 7, 0, 99};
        Arrays.sort(integers1);
        System.out.println(Arrays.toString(integers1));
        //sort重载的，也可以通过传入一个接口
        //定制排序传入第二个参数是一个匿名类实例，实际调用的是binarySort
        Arrays.sort(integers1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(integers1));
    }
}
