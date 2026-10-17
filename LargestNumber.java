//27. Find the largest number from user inputs.

import java.util.Scanner;

public class LargestNumber {

  public static void main(String[]args) { 
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter number: ");
  int number = input.nextInt();
  int largest = number;
  
  while(number != 0){
    if(number > largest) {
    
      largest = number;
    }
  
    System.out.print("Enter number: ");
    number = input.nextInt();
  }
  
  System.out.println(largest);
}

}
