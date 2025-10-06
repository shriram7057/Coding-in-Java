import java.util.*;

class switchcase {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet");
        ch = sc.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Alphabet is Vowel");
                break;
            default:
                System.out.println("Alphabet is consonant");

        }
    }
}