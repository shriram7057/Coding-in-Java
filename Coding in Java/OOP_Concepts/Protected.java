class A {
    protected void msg() { System.out.println("Hello"); }
}

class Protected extends A {
    public static void main(String[] args) {
        Protected obj = new Protected();
        obj.msg();
    }
}
