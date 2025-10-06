class Calculation {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Compile_Time_poly {
    public static void main(String[] args) {
        Calculation calc = new Calculation();
        // Compile-time polymorphism: selecting the appropriate add method based on
        // parameter types
        System.out.println("Sum of integers: " + calc.add(5, 3));
        System.out.println("Sum of doubles: " + calc.add(2.5, 3.7));
    }
}