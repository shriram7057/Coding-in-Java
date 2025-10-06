class Student {
    private String name; // private data

    public void setName(String n) { name = n; } // setter
    public String getName() { return name; }    // getter
}

class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Swaruu");
        System.out.println(s.getName());
    }
}
