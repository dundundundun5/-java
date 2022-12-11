package generic_;

public class CustomGeneric {

}

// T,R,M是泛型的标识符一般是单个大写字母
// 标识符可以有多个
class Tiger<T, R, M> {
    String name;
    R r;//属性使用到泛型
    M m;
    T t;
    //泛型数组不能初始化，
    // 因为数组在new的时候不饿能确定T的类型，就无法开辟空间
    T[] ts; //= new T[8]
    //构造器使用泛型
    //静态方法不能使用泛型
    //因为静态是和类相关的，类加载时，对象还没创建，
    // 对象创建时才知道类型
    //所以静态方法和静态属性无法在使用泛型时初始化
//    public static void(R r) {
//
//    }
    public Tiger(String name, R r, M m, T t) {
        this.name = name;
        this.r = r;
        this.m = m;
        this.t = t;
    }

    public <B , C> void haha(B b, C c) {
        //泛型方法
    }
    public void hehe(T e) {
        //方法使用了泛型，因为方法前没有泛型标识符
    }
    public String getName() {
        return name;
    }

    public R getR() {//返回类型可以使用泛型
        return r;
    }

    public M getM() {
        return m;
    }

    public T getT() {
        return t;
    }
}
