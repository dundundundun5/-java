package generic_;
import java.util.*;
public class GenericDetail {
    //1给泛型指定数据类型时，要求是引用类型
    List<Integer> list = new ArrayList<>();
    //List<int> error
    //2在给泛型传入基类类型后，可以指向子类类型
    //3泛型的使用形式
    List<Integer> list1 = new ArrayList<Integer>();
    //在实际开发中，往往简写成
    //编译器会进行类型推断，推荐这种写法
    ArrayList<Integer> list2 = new ArrayList<>();
    //如果不用<>，那就默认使用Object
}
