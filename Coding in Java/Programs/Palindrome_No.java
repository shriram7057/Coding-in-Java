import java.util.Scanner;

class Palindrome_No {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt(), rev = 0, temp = n;

        while (temp != 0) 
        {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        System.out.println(n + (n == rev ? " is Palindrome" : " is Not Palindrome"));
        // sc.close();
    }
}
