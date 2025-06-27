import java.util.*;
public class printUntilMultipleOfTen {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      do{
      System.out.println("Enter numbers (enter a multiple of 10 to stop):");

        int n = sc.nextInt(); // Read an integer from the user

         if(n%10==0){
            break; // Exit the loop if n is a multiple of 10
         }
      }
      while(true); // Continue indefinitely until a multiple of 10 is entered
    }
}
