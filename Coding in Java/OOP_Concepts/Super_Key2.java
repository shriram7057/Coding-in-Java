//Java Program to illustrate the use of super()
//Creating parent class
class Animal{  
    void eat(){System.out.println("eating...");}  
}  
//Creating child class
class Dog extends Animal{  
    void eat(){System.out.println("eating bread...");}  
    void bark(){System.out.println("barking...");}  
    void work(){  
        super.eat();  
        bark();  
    }  
}  
//Creating Main class to create object and call methods
class Super_Key2{  
    public static void main(String args[]){  
        Dog d=new Dog();  
        d.work();  
    }
}  