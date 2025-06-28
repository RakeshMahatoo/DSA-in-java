import java.util.*;

public class functionParameters2 {
    public static void printHello(String[] args) {
        System.out.println("hello world");
    }

    public static int calculateSum(int a, int b) {
        
       int sum = a + b;
       return sum;
    }


   public static void main(String[] args) {
    System.out.println("give two number a and b");
     Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
    int sum = calculateSum(a,b);
            System.out.println("sum is: " + sum);


   }

}
