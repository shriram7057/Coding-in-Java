public class Var_Key {
    public static void main(String[] args) {
        int var = 10; // variable declaration and initialization
        System.out.println("Variable value: " + var);

        final int CONST_VAR = 20; // constant declaration
        System.out.println("Constant value: " + CONST_VAR);

        // Uncommenting the next line will cause a compilation error
        // CONST_VAR = 30; // Error: cannot assign a value to final variable CONST_VAR
    }
}
