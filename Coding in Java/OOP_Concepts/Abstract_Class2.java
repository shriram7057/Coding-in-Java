abstract class Shape 
{
    abstract void draw();
}

// In real scenario, implementation is provided by others i.e. unknown by end
// user
class Rectangle extends Shape 
{
    void draw() 
    {
        System.out.println("drawing rectangle");
    }
}

class Circle extends Shape 
{
    void draw()
     {
        System.out.println("drawing circle");
    }
}

// In real scenario, method is called by programmer or user
class Abstract_class2 
{
    public static void main(String args[]) 
    {
        // In a real scenario, object is provided through method, e.g., getShape()
        // method
        Shape s = new Circle();
        s.draw();
    }
}