import java.util.Scanner;

public class spyno {
    public static void main(String args[]) {
        int no, product = 1, sum = 0, r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        no = sc.nextInt();
        while (no > 0) {
            r = no % 10;
            sum = sum + r;
            product = product * r;
            no = no / 10;
        }
        if (sum == product)
            System.out.println(" spy number.");
        else
            System.out.println(" not a spy number.");
    }
}