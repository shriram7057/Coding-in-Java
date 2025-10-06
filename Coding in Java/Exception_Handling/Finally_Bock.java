class Main {
    public static void main(String args[]) {
        try {
            // The below code does not throw any exception
            int data = 25 / 5;
            System.out.println(data);
        }
        // catch won't be executed
        catch (NullPointerException e) {
            System.out.println(e);
        }
        // executed regardless of exception occurred or not
        finally {
            System.out.println("Finally block is always executed");
        }
        System.out.println("rest of the code...");
    }
}