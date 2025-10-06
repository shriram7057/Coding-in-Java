import java.util.Scanner;

class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        boolean prime = n > 1;

        for (int i = 2; i < n && prime; i++)
            if (n % i == 0) prime = false;

        System.out.println(n + (prime ? " is Prime" : " is Not Prime"));
        sc.close();
    }
}
