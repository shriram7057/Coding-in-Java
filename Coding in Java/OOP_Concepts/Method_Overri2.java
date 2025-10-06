//Method Overriding program
class Base
{
    void display()
    {
        System.out.println("Display method of a Base Class!");
    }
}
class Derived extends Base
{
    void display()
    {
        super.display();
        System.out.println("Display method of a derived class!");
    }
class Method_Overri2
{
    public static void main(String[] args) 
    {
        Derived d1=new Derived(); 
        d1.display();
    }
}   
}