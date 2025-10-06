import java.util.*;

class Largest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++)
            a[i] = sc.nextInt();

        int max = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > max)
                max = a[i];

        System.out.println("Largest number: " + max);
    }
}
