//Java program to illustrate the use of static block
public class Static_Block 
{
    static 
    {
        System.out.println("static block is invoked");
    }

    public static void main(String args[]) 
    {
        System.out.println("main() method is invoked");
    }
}