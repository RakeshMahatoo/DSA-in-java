
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int addEven = 0;
        int addOdd = 0;
        int number;
        int choice;
        do {
            System.out.println("Enter the Number");
            number = sc.nextInt();
            if (number % 2 == 0) {
                addEven = addEven + number;
            } else {
                addOdd = addOdd + number;
            }
            System.out.println("Do you want to continue? Press 1 for Continue or 0 for DisContinue");
            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("The Sum of Even number you given is: " + addEven);
        System.out.println("The Sum of Even number you given is: " + addOdd);

    }
}
