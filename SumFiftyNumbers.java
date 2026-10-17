//19. Find the sum of numbers from 1 to 50.

public class SumFiftyNumbers {

  public static void main(String[]args){
  
  int number = 1;
  int sum = 0; 
  
  while(number <= 50) {
      sum = sum + number;
      number++;
  
  }
  
    System.out.println(sum);
  }
}
