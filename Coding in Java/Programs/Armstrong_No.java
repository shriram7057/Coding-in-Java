import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt(), sum = 0, temp = n;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit; // cube of digit
            temp /= 10;
        }

        System.out.println(n + (n == sum ? " is Armstrong" : " is Not Armstrong"));
        sc.close();
    }
}
