class Person {
    private int age; // private variable

    public void setAge(int a) { age = a; }  // setter
    public int getAge() { return age; }     // getter
}

class Encapsulation2 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(25);
        System.out.println("Age: " + p.getAge());
    }
}
