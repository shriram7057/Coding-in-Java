import java.util.*;

class ForEachLoopDemo {
    public static void main(String args[]) {
        int array[] = new int[5];
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five array elements:");
        for (i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Array Elements:");
        for (int p : array) {
            System.out.println(p);
        }
    }
}