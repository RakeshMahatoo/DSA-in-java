public class findFactorial {
    public static void main(String[] args) {
        // int multi = 0;
         int n = 4;
        int ans =  factorial(n);
         System.out.println("factorial of "+ n + " is " + ans);
    }


    public static int factorial(int n) {
          int multi = 1;
        for(int i = 1 ; i<=n ;i++){
           multi = multi * i;
        }
        return multi;
    }
}
