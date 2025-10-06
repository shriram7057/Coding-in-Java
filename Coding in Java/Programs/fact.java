class fact {
    public static int fact(int n) {
        if (n != 0) {
            return n * fact(n - 1);
        } else {
            return n;
        }

    }

    public static void main(String args[]) {
        int num = 5;
        System.out.println("factorial of a number:" + fact(num));
    }
}