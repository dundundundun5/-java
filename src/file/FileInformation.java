package file;

import org.junit.jupiter.api.Test;

import java.io.File;

public class FileInformation {
    public static void main(String[] args) {

    }
    @Test
    public void info() {
        File file = new File("./src/file/news1.txt");

        //文件信息的方法
        System.out.println("名字 " + file.getName());
        System.out.println("绝对路径 " + file.getAbsolutePath());
        System.out.println("大小（字节） " + file.length());
        System.out.println("是否为文件 " + file.isFile());
        System.out.println("是否为目录 " + file.isDirectory());
        System.out.println("父目录 " + file.getParent());
    }
}
