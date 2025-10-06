public class Strings2 
{
    public static void main(String[] args) {
        // Creating a String
        String greeting = "Hello";
        // Concatenating strings
        String sentence = greeting + ", World!";
        // Using a method from the String class
        int length = sentence.length();
        System.out.println(sentence); // Output: Hello, World!
        System.out.println("Length: " + length); // Output: Length: 13
    }
}