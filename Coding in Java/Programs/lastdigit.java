import java.util.*;

public class lastdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        System.out.println("Enter a Number");
        no = sc.nextInt();
        int i = no % 10;
        System.out.println("Last Digit=" + i);

    }
}