//Java Program to get the cube of a given number using the static method  
  
class Calculate{  
  static int cube(int x){  
  return x*x*x;  
  }  
}
class Static_Method_ex2{
  public static void main(String args[]){  
  int result=Calculate.cube(5);  
  System.out.println(result);  
  }  
}  