class Data { int value; }

class Main {
    public static void main(String[] args) {
        Data obj = new Data();
        obj.value = 10;
        modify(obj);
        System.out.println("After method call, value = " + obj.value);
    }

    static void modify(Data d) {
        d.value += 5; // modifies the actual object
    }
}
//Example of an abstract class that has abstract and non-abstract methods
