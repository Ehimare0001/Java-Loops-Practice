//21. Ask the user for 5 numbers and calculate the total.

import java.util.Scanner;
public class FiveNumbersTotal { 

  public static void main(String[]args) { 
  
  Scanner input = new Scanner(System.in);
  
  int count = 1;
  int total = 0;

  
  while(count <= 5) { 
  
  System.out.print("Enter number: ");
   int number = input.nextInt();
  
    total = total + number;
    count++;
  
  }
  System.out.println("Total: " + total);
  }
}
