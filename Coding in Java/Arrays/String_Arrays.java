import java.util.*;

class String_Arrays {
    public static void main(String[] args) {
        String[] names = {"Amit", "Sita", "Ravi", "Neha"};

        // Using for loop
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // Using enhanced for loop
        System.out.println("Using for-each loop:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
