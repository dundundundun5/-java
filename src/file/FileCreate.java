package file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {

    }
    //方式1 直接创建
    @Test
    public void create01() {
        String filePath = "./src/file/news1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //方式2 通过父母文件的路径创建子文件
    @Test
    public void create02() {
        File parentFile = new File("./src/file");
        String fileName = "news2.txt";
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //方式3
    @Test
    public void create03() {
        String parentPath = "./src/file";
        String filePath = "news3.txt";
        File file = new File(parentPath, filePath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
