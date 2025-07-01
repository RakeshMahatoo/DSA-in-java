public class invertedHarlfPyramidWithNumber {
    public static void inverted_rotated_half_pyramid_with_Number(int n) {
    
        // for(int i = n ; i>=1 ;i--){
        //    for(int j=1; j<=i;j++){
        //      System.out.print(j);
        //    }
        //    System.out.println();
        // }

        for(int i=1 ;i <=n ; i++){
            for(int j=1 ; j<=n+1-i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted_rotated_half_pyramid_with_Number(5);
    }
}
