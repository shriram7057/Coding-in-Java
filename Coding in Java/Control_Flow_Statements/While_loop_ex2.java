class While_loop_ex2 {
    public static void main(String args[]) 
    {
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0 || i % 5 == 0) 
            {
                System.out.println(i);
            }
            i++; // ✅ increment to avoid infinite loop
        }
    }
}
