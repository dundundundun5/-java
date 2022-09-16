package system_;

import java.util.Arrays;

public class System_ {
    public static void main(String[] args) {
        //退出当前程序，0表示正常的状态
//        System.out.println("ok1");
//        System.exit(0);
//        System.out.println("ok2");
        int[] src = {1, 2, 3};
        int[] dest = new int[3];//dest = {0, 0, 0}
        /**
         * 把原数组的数据复制到目标数组
         * src – the source array.
         * srcPos – starting position in the source array.
         * dest – the destination array.
         * destPos – starting position in the destination data.
         * length – the number of array elements to be copied.
         */
        System.arraycopy(src, 0, dest, 0, 3);
        System.out.println("dest=" + Arrays.toString(dest));
        //返回当前时间距离1970-1-1的毫秒数
        System.out.println(System.currentTimeMillis());
    }
}
