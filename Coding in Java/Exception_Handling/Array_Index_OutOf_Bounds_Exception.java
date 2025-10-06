//Java Program to illustrate the use of ArrayIndexOutOfBoundsException in Java  
public class Array_Index_OutOf_Bounds_Exception 
{    
    public static void main(String[] args) 
    {    
        int[] numbers = {1, 2, 3, 4, 5}; // Initializing an array with 5 elements    
        try 
        {    
            int index = 10; // Accessing an index that is out of bounds    
            int value = numbers[index]; // Attempting to access an element at an invalid index    
            System.out.println("Value at index " + index + ": " + value);    
        } catch (ArrayIndexOutOfBoundsException e) {    
            System.out.println("Error: Index is out of bounds.");    
            // Additional error handling code can be added here    
        }    
    }    
}   