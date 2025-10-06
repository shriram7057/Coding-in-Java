//Java Program to illustrate how to declare, instantiate, initialize    
//and traverse the Java array.    
public class Array2
{    
 public static void main(String args[]){    
    //declaration and instantiation of an array  
    int a[]=new int[5];  
    a[0]=10;//initialization    
    a[1]=20;    
    a[2]=70;    
    a[3]=40;    
    a[4]=50;    
    //traversing array    
    for(int i=0;i<a.length;i++){//length is the property of array    
        System.out.println(a[i]);    
    }  
 }  
}