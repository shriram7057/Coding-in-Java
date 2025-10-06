public class SumAndProduct {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5};

        // Calculate sum and product
        int sum = calculateSum(array);
        int product = calculateProduct(array);

        // Print the results
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Product of array elements: " + product);
    }

    // Method to calculate the sum of array elements
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Method to calculate the product of array elements
    public static int calculateProduct(int[] array) {
        int product = 1;
        for (int num : array) {
            product *= num;
        }
        return product;
    }
}

