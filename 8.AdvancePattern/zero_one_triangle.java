public class zero_one_triangle {
    public static void main(String[] args) {
        zero_and_one(5);
    }

    public static void zero_and_one(int n) {
        int count = 1;
        for(int i = 1; i<=n ;i++){
            for(int j=1; j<=i ; j++){
             int newCount = count % 2;
               System.out.print(newCount+ " ");
               count++;
            }
            System.out.println();
        }
    }
}
