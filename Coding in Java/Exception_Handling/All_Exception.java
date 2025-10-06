class All_Exception {
    public static void main(String[] args) {
        // ArithmeticException
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic: " + e);
        }

        // ArrayIndexOutOfBoundsException
        try {
            int a[] = new int[3];
            a[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndex: " + e);
        }

        // NullPointerException
        try {
            String s = null;
            s.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointer: " + e);
        }

        // NumberFormatException
        try {
            int n = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormat: " + e);
        }

        // ClassCastException
        try {
            Object x = new Integer(5);
            String y = (String) x;
        } catch (ClassCastException e) {
            System.out.println("ClassCast: " + e);
        }

        // StringIndexOutOfBoundsException
        try {
            String str = "Hi";
            char c = str.charAt(5);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndex: " + e);
        }

        // Finally block example
        try {
            System.out.println("Try block");
        } finally {
            System.out.println("Finally always executes");
        }

        System.out.println("Program continues...");
    }
}
