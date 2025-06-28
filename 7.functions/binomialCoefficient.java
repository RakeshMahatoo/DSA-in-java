import java.util.*;

public class binomialCoefficient {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number for N! ");
        int n = sc.nextInt();
        System.out.println("Enter Number for R! ");
        int r = sc.nextInt();
       System.out.println("Binomial Coefficient (nCr): " + binCoeff(n, r));
    }

    public static int factorial(int num) {
        int multi = 1;
        for(int i = 1; i<=num ;i++){
            multi = multi * i;
        }
        return multi;
    }

    public static int binCoeff(int n , int r){
       int fact_n = factorial(n);
       int fact_r = factorial(r);
       int fact_nmr = factorial(n-r);
       
       int binCoeff = fact_n/ (fact_r * fact_nmr);
       return binCoeff;  
    }
    
}
