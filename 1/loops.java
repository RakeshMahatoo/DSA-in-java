
import java.util.Scanner;
import java.util.concurrent.locks.Condition;

public class loops {

    public static void main(String args[]) {
        // For Loop

        //   for(initialisation; condition; updation){
        // //   }
        // for (int counter = 0; counter < 100; counter++) {
        //     System.out.println("Jai Shree Ram");
        // }
        // // while(Condition){
        // //     //do somtinog
        // //     count++;
        // // }
        // // while loop
        // int i = 0;
        // while (i < 11) {
        //     System.out.println(i);
        //     i++;
        // }
        // // do{
        // //     // do something
        // // }while(Condition);
        //  int j = 10;
        //  do { 
        //     System.out.println(j); // condition true ho ya false 1 time use krwa na hain tabhi use krro
        //                 j++;   
        //  } while (j<21);
        // print the first n natural number; n=4; 1+2+3+4
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;
        // for (int k = 1; k <= n; k++) {
        //     sum = sum + k;
        // }
        // System.out.println(sum);
        // print the table of a number input by user/
        Scanner sc = new Scanner(System.in);
        int multi = 0;
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            multi = n * i;

            System.out.println("2 x"+ " " + i + "=" + multi);
        }

    }

}
