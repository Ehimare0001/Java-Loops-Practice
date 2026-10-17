//26. Find the factorial of 5 using a while loop.

public class FactorialOfFive{

  public static void main(String[]args) { 
  
  int factorial = 1;
  int index = 1; 
  
  while(index <= 5){
  
    factorial = factorial * index;
      index++;
      
      System.out.println(factorial);
  
  
  }
  }
}
