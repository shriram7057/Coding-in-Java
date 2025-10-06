import java.util.*;

class swap {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Enter the number");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("before swapping" + x + " " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping" + x + " " + y);
    }

}