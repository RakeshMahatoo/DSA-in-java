
import java.util.Scanner;

public class binary_to_addNum {

    public static void main(String[] args) {
        System.out.println("type binary number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = binaryToAdd(n);
        System.out.println("the binary number of: " + result);

    }

    public static int binaryToAdd(int n) {

        int original = n;
        int rem = 0;
        int rev = 0;

        while (n > 0) {
            rem = n % 10;
            rev = rev + rem;
            n = n / 10;
        }
        return rev;
    }
}
