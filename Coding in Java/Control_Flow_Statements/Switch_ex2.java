import java.util.*;
public class Switch_ex2 {
    public static void main(String[] args) 
    {
       int no;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a single digit number ");
       no=sc.nextInt();
       switch(no)
       {
         case 1:System.out.println("You entered ONE");
         break;
         case 2:System.out.println("You entered TWO");
         break;
         case 3:System.out.println("You entered THREE");
         break;
         default:System.out.println("invialid number");
       }
    }
}
