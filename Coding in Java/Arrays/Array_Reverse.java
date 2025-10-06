import java.util.*;
class arrayReverses
{
    public static void main(String args[])
    {
        int a[]=new int[5];
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter five array elements");
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Array elements in reverse order");
        for(i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }
}