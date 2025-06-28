import java.util.*;

public class functionSynta1 {
    public static void printHello(){
        System.out.println("Hello World");
        System.out.println("hellow world");
    }
    public static int calculateSum(int num1, int num2) {
      
        int sum = num1 + num2;
        return sum;
    }



    public static void main(String args[]){ 
        printHello();
           Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       int sum =  calculateSum(a,b);
       System.out.println("Sum is :" + sum);
       
    }
}
