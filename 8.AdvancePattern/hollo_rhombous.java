public class hollo_rhombous {
    public static void main(String[] src){
        hollow_rhombous(6);
    }

    public static void hollow_rhombous(int n) {
       for(int line=1; line<=n; line++){
        for(int space = 1; space<=n-line; space++){
            System.out.print(" ");
        }
        if(line == 1 || line == n){
            for(int star=1; star<=n;star++){
                System.out.print("*");
            }
        }
        else{
           System.out.print("*");
           for(int i=1; i<=n-2 ;i++){
            System.out.print(" ");
           }
           System.out.print("*");
        }
        System.out.println();
       }
    }
}
