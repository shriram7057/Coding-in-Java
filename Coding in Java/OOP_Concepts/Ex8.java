class Addition {
    int a, b, c;

    void getdata() {
        a = 100;
        b = 50;
    }

    void putdata() {
        c = a + b;
        System.out.println("Addition=" + c);
    }

    public static void main(String args[]) {
        Addition a1 = new Addition();
        a1.getdata();
        a1.putdata();
    }
}