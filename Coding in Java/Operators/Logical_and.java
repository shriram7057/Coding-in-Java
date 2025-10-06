public class Logical_and {
    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        int c = 20;
        // (a < b) evaluates to false. Therefore, (a < c) condition will not executed.
        // Hence, the value of a will remain 10
        if ((a < b) && (++a < c))
            System.out.println("if block is executed.");
        else
            System.out.println("else block is executed.");
        System.out.println("The value of a is: " + a);
    }
}