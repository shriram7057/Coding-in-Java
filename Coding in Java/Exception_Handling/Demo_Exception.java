//Java Program to illustrate the use of Number Format Exception in Java  
public class Demo_Exception {    
    public static void main(String[] args) 
    {    
        String str = "abc"; // Initializing a String with non-numeric characters    
        try 
        {    
            int num = Integer.parseInt(str); // Attempting to parse a non-numeric string to an integer    
            System.out.println("Parsed number: " + num);    
        } catch (NumberFormatException e) {    
            System.out.println("Error: Unable to parse the string as an integer.");    
            // Additional error handling code can be added here    
        }    
    }    
}