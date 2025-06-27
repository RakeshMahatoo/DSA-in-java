

public class reverseNumber {
    public static void main(String[] args) {
        int n = 10899;

        while(n > 0){
            int lastDigit = n % 10; // Get the last digit
            System.out.print(lastDigit); // Print the last digit
            n = n / 10; // Remove the last digit from n
        }
    }
}
