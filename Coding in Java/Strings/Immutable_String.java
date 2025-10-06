public class Immutable_String {
    public static void main(String[] args) {
        // Original string
        String originalString = "Java";
        System.out.println("Original string: " + originalString);

        // Attempt to modify the original string
        String modifiedString = originalString.concat(" Programming");

        // Showing that the original string remains unchanged
        System.out.println("After modification, original string: " + originalString);

        // The result of the modification attempt is stored in a new string
        System.out.println("Modified string: " + modifiedString);

        // Demonstrating further that the original string is immutable
        originalString.toUpperCase(); // This operation does not change the original string
        System.out.println("After calling toUpperCase on original string: " + originalString);
        
        // Correct way to use the result of a string operation
        String upperCaseString = originalString.toUpperCase(); // Stores the result in a new string
        System.out.println("Original string in uppercase: " + upperCaseString);
    }
}