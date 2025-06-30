

public class hollowBoxPattern {
    public static void hellow_rectangle(int toRows, int toCols){
     
        for(int i=1; i<=toRows; i++){
            for(int j = 1; j<=toCols; j++){
                if(i==1 || i == toRows || j==1 || j== toCols){
                    System.out.print("o");
                }
                else{
                    System.out.print( " ");
                }

            }
            System.out.println();
        }
    }
    public static void main(String args[]){
            hellow_rectangle(5,4);
    }
}
  