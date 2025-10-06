public class User_Defined_M {
    // Static method
    static void greet() {
        System.out.println("Hello from the static method!");
    }

    // Non-static method
    void farewell() {
        System.out.println("Goodbye from a non-static method!");
    }

    public static void main(String args[]) {
        User_Defined_M obj = new User_Defined_M();
        obj.farewell(); // calling non-static method
        User_Defined_M.greet(); // calling static method
    }
}
