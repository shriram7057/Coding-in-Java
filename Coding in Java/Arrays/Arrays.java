import java.util.*;

class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];  // create an array of size 5

        System.out.println("Enter 5 array elements:");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt(); // store elements in array
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
