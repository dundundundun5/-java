package generic_;
import java.util.*;
public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}

//泛型接口的类型，在继承接口或者实现接口时确定
interface IUsb<U, R> {
    //接口的成员是泛型，不能使用泛型
    //普通方法种可以使用接口泛型
    R get(U u);
    void hi(R r);
    void run(R r1, R r2, U u1, U u2);
    //jdk8中，可以在接口中使用默认方法
    default R method(U u) {
        return null;
    }
}
//实现接口时，直接指定泛型接口的类型
//class BB implements IUsb<Integer, Float> {
//    public Float get(Integer i) {
//
//    }
//}
//没有指定类型，则等价于<Object,Object>
//在继承接口时指定泛型接口的类型
interface IA extends IUsb<String ,Double> {

}

//当我们去实现IA接口时
//因为IA继承已经指定了类型，故String Double