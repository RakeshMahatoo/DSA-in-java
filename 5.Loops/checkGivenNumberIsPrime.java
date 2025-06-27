
import java.util.*;
import java.util.Scanner;

public class checkGivenNumberIsPrime {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         boolean isPrime = true;
         System.out.println("Enter a number to check if it is prime:");
         int n = sc.nextInt();  // n=5
          if(n==2){
            System.out.println("The number " + n + " is prime.");
            return; // 2 is the only even prime number
          }
         for(int i=2; i<=n-1 ;i++){
            if(n%i == 0){   // n is a multiple of i ( i not equal t 1 or n)
                isPrime = false;
            }
         }
         if(isPrime == true){
            System.out.println("The number " + n + " is prime.");
         } else {
            System.out.println("The number " + n + " is not prime.");
         }

    }
}
