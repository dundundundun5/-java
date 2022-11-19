package collection_;
import java.util.*;
public class CollectionIterator {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三国演义","罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));
        //先得到集合col对应的迭代器
        Iterator iterator = col.iterator();
        //使用while循环便利
        while(iterator.hasNext()) {
            //返回下一个元素，类型是Object
            //next的编译类型是Object
            //运行类型取决于真正存放的对象类型
            Object next = iterator.next();
            System.out.println("obj=" + next);
        }
        //快速生成while循环 while->itit
        iterator = col.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();

        }
        //ctrl+J 显示所有快捷键的快捷键
        // 当退出while循环后，这时iterator指向最后一个元素
        //再调用next() 会报异常NoSuchElementException
        //4. 如果希望再次遍历，需要重置我们的迭代器
    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}