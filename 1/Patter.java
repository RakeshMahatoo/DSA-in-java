
import java.util.Scanner;

public class Patter {
    public static void main(String[] args) {
        


    // //1.     *
    //          *
    //          * 
    //          * 

    /*  Scanner sc = new Scanner(System.in);
    int n  = sc.nextInt();
    int m = sc.nextInt();

for(int i = 1 ; i<=n; i++){
    for(int j=1; j<=m; j++){
        System.out.print("*");
    }
    System.out.println();
} */


/*==========Print the patter===========================
 

*****
*   *
*   *
*****

*/
int n = 4;
int m = 5;

for(int i=1; i<=n; i++){  // outer loop
        // inner loop

        for(int j = 1; j<=m; j++){
            // cell --> (i,j)
            if(i==1 || j==1 || i==n || j==m){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
}
  

































































    }
    
}
