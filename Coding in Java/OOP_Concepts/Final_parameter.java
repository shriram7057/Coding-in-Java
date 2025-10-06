public class Final_parameter {  
    public void value(final int num) {  
        System.out.println(num);  
    }  

    public static void main(String[] args) {  
        Final_parameter obj = new Final_parameter();  
        obj.value(500);  
    }  
}
