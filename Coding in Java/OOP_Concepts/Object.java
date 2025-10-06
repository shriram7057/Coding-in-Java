class Dog
{
    String name;
    void Bark()
    {
        System.out.println(name+" "+"Says Woof!");
    }
}
public class Object
{
    public static void main(String[] args)
    {
        Dog dog1=new Dog();
        dog1.name="Tommy";
        dog1.Bark();
        
        Dog dog2=new Dog();
        dog2.name="Bruno";
        dog2.Bark();
    }
}