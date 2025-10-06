public class factorial_No {
    public static void main(String[] args) {
        int i,fact=1;
        int numbers=5;//It is the number to calculate factorial
        for (i =1;i<=numbers;i++){
            fact=fact*i;
        }     
        System.out.println("Factorial of "+numbers+" is: "+fact);
    }
}
