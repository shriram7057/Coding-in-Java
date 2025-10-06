public class Fibonacci_Series
{
    public static void main(String[] args) {
        int n=10;
        int first=0;
        int second=1;
        System.out.print("Fibonacci Series up to:"+n);

        for (int i=1;i<=n;i++)
        {
            System.out.print(first+" ");
            // compute the next term
            int next=first+second;
            first=second;
            second=next;
        }
    }
}