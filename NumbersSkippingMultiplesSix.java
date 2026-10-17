//29. Print numbers skipping multiples of 6.

public class NumbersSkippingMultiplesSix{ 

  public static void main(String[]args) { 
  
  int number = 1;
    
  while(number <= 100){
         
    if (number % 6 != 0) { 
      
  
        System.out.println(number);
      
    }
    number++;
     
  }
  
  
  }

}
