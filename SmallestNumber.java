//28. Find the smallest number from the user inputs.

import java.util.Scanner;
public class SmallestNumber{
  public static void main(String[]args) { 
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter number: ");
  int number = input.nextInt();
  
  int smallest = number;
  
  while(number != 0){
  
    if(number < smallest) { 
    
      smallest = number;
    
    }
    System.out.print("Enter number: ");
    number = input.nextInt();
  
  }
   System.out.println(smallest);
  
  }


}
