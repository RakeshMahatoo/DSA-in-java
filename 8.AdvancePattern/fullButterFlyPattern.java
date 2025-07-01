public class fullButterFlyPattern {
    public static void main(String[] args) {
        butter_fly(5);
    }
    public static void butter_fly(int n) {
        //1st half
        for(int i =1; i<=n ; i++){
            for(int j=1; j<=i ; j++){
                //starts
                System.out.print("*");
            }
               //space

               for(int space = 1; space<=(n-i)*2 ; space++){
                System.out.print(" ");
               }
               for(int star = 1; star<=i; star++){
                System.out.print("*");
               }
               System.out.println();
               
        }

        //second half
         for(int i =n; i>=1 ; i--){
            for(int j=1; j<=i ; j++){
                //starts
                System.out.print("*");
            }
               //space

               for(int space = 1; space<=(n-i)*2 ; space++){
                System.out.print(" ");
               }
               for(int star = 1; star<=i; star++){
                System.out.print("*");
               }
               System.out.println();
               
        }
    }
}
