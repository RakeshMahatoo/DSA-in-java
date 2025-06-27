

public class sumNautralNo {
    public static void main(String[] args) {
        int n = 5; // Change this to calculate the sum of natural numbers up to n
        int sum = 0;
        int i = 1; // Start from the first natural number
        while (i<=n) { 
            sum += i;
            i++;
        }
        System.out.println("The sum of natural numbers up to " + n + " is: " + sum);
}
}
