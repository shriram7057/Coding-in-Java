import java.util.*;
import java.lang.*;

class book 
{
    int bookid;
    String name;
    float price;
    Scanner sc = new Scanner(System.in);

    void get_book_info() {
        System.out.println("Enter book id");
        bookid = sc.nextInt();
        System.out.println("Enter book name");
        name = sc.next();
        System.out.println("Enter book price");
        price = sc.nextFloat();
    }

    void disp_book_info() {
        System.out.println("bokid=:" + bookid);
        System.out.println("book name=:" + name);
        System.out.println("book price=:" + price);
    }

    public static void main(String args[]) {
        book b1 = new book();
        b1.get_book_info();
        b1.disp_book_info();
    }
}
