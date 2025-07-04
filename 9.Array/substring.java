import java.util.*;
public class substring{
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14};
    printArray(number);
}

public static void printArray(int number[]){
   for(int i=0; i<number.length; i++){
    for(int j=0; j<number.length;j++){
        for(int k=i; k<=j; k++){ 
            System.out.print(number[k]+ ",");
        }
        System.out.println();
    }
    System.out.println();
   }
}
}

