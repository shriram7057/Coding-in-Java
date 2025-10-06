import java.util.*; 
class PositiveNegativeNo 
{ 
 public static void main(String args[]) 
 { 
 int no; 
 Scanner sc=new Scanner(System.in); 
 System.out.println("Enter Number:"); 
 no=sc.nextInt(); 
 if(no!=0) 
 { 
 if(no>0) 
 { 
 System.out.println("Positive Number"); 
 } 
 else 
 { 
 System.out.println("Negative Number"); 
 } 
 } 
 else 
 { 
 System.out.println("Zero is neither positive nor negative"); 
 } 
 } 
} 
