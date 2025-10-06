public class Logical_or {
    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        int c = 20;
        // the first condition (a > b) evaluates to true. Therefore, (a++ < c) will not
        // be executed.
        // Hence, the value of a will remain 10.
        System.out.println(a > b || a++ < c);
        System.out.println("The value of a is: " + a);
        // the first condition (a < b) evaluates to false. Therefore, (a++ < c) will be
        // executed.
        // Hence, the value of a will be 11.
        System.out.println(a < b || a++ < c);
        System.out.println("The value of a is: " + a);
    }
}