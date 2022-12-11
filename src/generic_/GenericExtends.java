package generic_;
import java.util.*;
public class GenericExtends {
    public static void main(String[] args) {
        // 接受任意泛型类型
        List<?> list = new ArrayList<>();
        // 只接受Number子类的泛型类型
        List<? extends Number> list1 = new ArrayList<>();
        // 只接受父类为Dog的泛型类型
        List<? super Dog> list2 = new ArrayList<>();
        //常常作为函数的形参，既允许传入一个泛型
        // ，但又约束泛型存放的数据类型
    }
}
