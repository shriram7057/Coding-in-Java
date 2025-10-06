public class Bitwise_Complement {    
public static void main(String args[]){    
int a = 5;   // binary representation 0101
// ~a = 1010 which will be represented as 10 in decimal format 
// The compiler will give 2’s complement of this number which is -6
System.out.println("The value of ~a is: " + (~a));
}
}  