class A {
    public void msg() { System.out.println("Hello"); }
}

class B {
    public static void main(String[] args) {
        A obj = new A();
        obj.msg();
    }
}
