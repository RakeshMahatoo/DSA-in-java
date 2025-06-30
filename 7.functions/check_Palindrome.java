public class check_Palindrome {
    public static void main(String[] args) {
       pCheck(121);
       pCheck(321);
        
    }

    public static void pCheck( int n) {
        int original = n;
        int rem = 0;
        int reverse = 0;
        
        while(n > 0){
         rem = n % 10;
       reverse = reverse * 10 + rem;
           n = n /10;

        }
        if(reverse == original){
            System.out.println("the number is palindrome " + original);
        }
        else{
            System.out.println("the number is not palindrome " + original);
        }
    
    }
}
