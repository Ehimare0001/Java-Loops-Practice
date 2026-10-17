//22. Keep asking the user for numbers until they enter zero
import java.util.Scanner;
public class UsersNumbers{

  public static void main(String[]args){ 
  
  Scanner input = new Scanner(System.in);
  
  int number = 1;
  
  while(number != 0){ 
  
    System.out.print("Enter number: ");
    number = input.nextInt();
    
     if(number == 0){
     break;
     
     }
    System.out.println(number);
  }
  
  
  }

}
