import java.util.*;

class String_Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Trimmed: " + str.trim());
        System.out.println("Character at index 0: " + str.charAt(0));
        System.out.println("Substring (0 to 3): " + str.substring(0, 3));
        System.out.println("Contains 'a': " + str.contains("a"));
        System.out.println("Starts with 'H': " + str.startsWith("H"));
        System.out.println("Ends with 'd': " + str.endsWith("d"));
        System.out.println("Replace 'a' with 'x': " + str.replace('a','x'));
        System.out.println("Index of 'e': " + str.indexOf('e'));
        System.out.println("Compare to 'Hello': " + str.compareTo("Hello"));
        System.out.println("Equals 'Hello': " + str.equals("Hello"));
        System.out.println("EqualsIgnoreCase 'hello': " + str.equalsIgnoreCase("hello"));

        // Splitting string
        String[] words = str.split(" ");
        System.out.println("Words in string:");
        for(String w : words) System.out.println(w);
    }
}
