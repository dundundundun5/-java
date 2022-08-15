package enumeration;

public class EnumDetail {
    public static void main(String[] args) {

    }
}

class A {

}

//enum类只能继承接口，不能接触普通类
//enum Season4 extends A {
//
//}
interface IPlaying {
    public void playing();
}
enum Music implements IPlaying {
    CLASSIC,JAZZ,ELECTRONIC;
    @Override
    public void playing() {
        System.out.println("playing musics");
    }
}