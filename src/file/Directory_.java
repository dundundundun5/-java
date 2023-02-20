package file;

import org.junit.jupiter.api.Test;

import java.io.File;

public class Directory_ {
    public static void main(String[] args) {

    }
    @Test
    public void m() {
        //不一定是文件，也可以删除目录
        File file = new File("./src/file/news1.txt");
        if (file.exists())
            try {
                file.delete();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    @Test
    public void f() {
        String path = "./src/file/haha";
        File file = new File(path);
        if (!file.exists())
            try {
                //mkdirs创建多级目录 mkdir创建一级目录
                file.mkdirs();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
