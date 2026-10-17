//23. Create a password checker using a while loop.

import java.util.Scanner;
public class PasswordChecker{
  public static void main(String[]args) { 
  
  Scanner input = new Scanner(System.in);
  
  String password = "Fast";
  String userPassword = "";
  
  while(!userPassword.equals(password)) {
    
    System.out.print("Enter password: ");
    userPassword = input.nextLine();
  
  }
  
  System.out.println("Correct Password");
  }

}


