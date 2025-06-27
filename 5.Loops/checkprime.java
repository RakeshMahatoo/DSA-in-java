
import java.util.*;

public class checkprime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n == 2) {
            System.out.println("the number " + n + " is prime.");
        } else {

            System.out.println("Enter a number to check if it is prime:");
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    isPrime = false;
                } else if (isPrime == true) {
                    System.out.println("the number " + n + " is prime.");
                }
            }
            if (isPrime == false) {
                System.out.println("the number " + n + " is not prime.");
            }
        }

    }
}
