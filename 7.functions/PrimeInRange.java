import java.util.*;

public class PrimeInRange {

    public static void findPrimes(int n) {
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            // check if i is prime
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }  
    }
 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter upper range: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers up to " + n + " are:");
        findPrimes(n);
    }
}
