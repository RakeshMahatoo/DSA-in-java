public class verticle_zero_one_triangle {
    public static void main(String[] args) {
        zero_one(5);
    }

    public static void zero_one(int n){
        int count = 1;
        for(int i =1 ; i<=n ;i++){
            for(int j=1; j<=i ; j++){
                int even = i+j;
               if( even % 2 == 0){
                System.out.print("1");
               }
               else{
                System.out.print("0");
               }
            }
           
            System.out.println();
        }
    }
}
