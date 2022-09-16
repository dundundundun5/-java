package math_;
import java.util.*;
public class ArrayExercise {
    //自定义Book类，里面包含name和price，按price排序（从大到小和从小到大），要求用两种方式排序
    //有一个Book[] books = 4本书对象
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100);
        books[1] = new Book("金瓶梅新", 90);
        books[2] = new Book("青年文摘20年", 5);
        books[3] = new Book("java从入门到放弃", 300);

        Arrays.sort(books, Book.cmp(Mode.PRICE_ASE));
        for(Book b : books)
            System.out.print(b + " ");
        System.out.println();

        Arrays.sort(books, Book.cmp(Mode.PRICE2_DES));
        for(Book b : books)
            System.out.print(b + " ");
        System.out.println();

        Arrays.sort(books, Book.cmp(Mode.TITLE));
        for(Book b : books)
            System.out.print(b + " ");
        System.out.println();
    }
}
enum Mode {
    PRICE_ASE, PRICE2_DES, TITLE
}
class Book {

    private String name;
    private int price;
    public Book() {}
    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public static Comparator<Book> cmp(Mode mode) {
        if (mode == Mode.PRICE_ASE)
            return new Comparator<Book>() {
                @Override
                public int compare(Book o1, Book o2) {
                    return o1.price - o2.price;//按价格从小到大
                }
            };
        else if (mode == Mode.PRICE2_DES)
            return new Comparator<Book>() {
                @Override
                public int compare(Book o1, Book o2) {
                    return o2.price - o1.price;//按价格从大到小
                }
            };
        else if (mode == Mode.TITLE)
            return new Comparator<Book>() {
                @Override
                public int compare(Book o1, Book o2) {
                    return o2.name.length() - o1.name.length();
                }
            };
        else
            return null;
    }
    public String toString() {
        return String.format("[%s, %d]", name, price);
    }
}