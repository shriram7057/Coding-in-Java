// Let us see another example of default constructor  
// which displays the default values  

class Student {  
    int id = 12;  
    String name = "Swaruu";  

    // method to display the value of id and name  
    void display() {  
        System.out.println(id + " " + name);  
    }  
}  

// Main class to create objects and call methods  
class Dc2 {  
    public static void main(String args[]) {  
        // creating objects  
        Student s1 = new Student();  
        Student s2 = new Student();  

        // displaying values of the objects  
        s1.display();  
        s2.display();  
    }  
}  
