class Static_Binding {
    private void eat() {
        System.out.println("dog is eating...");
    }

    public static void main(String args[]) {
        Static_Binding d1 = new Static_Binding();
        d1.eat();
    }
}