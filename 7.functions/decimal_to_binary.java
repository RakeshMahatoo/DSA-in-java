public class decimal_to_binary {
    public static void deciToBinary(int value){
        int n = value;
        int rem = 0;
        int bin = 0;
        int pow =0;
        while(value>0){
            rem = value % 2;
            bin = bin + (rem * (int)Math.pow(10,pow));
            pow++;
            value = value / 2;
         }
         System.out.println("the Decimal to binary conversion " + n + "is " + bin);
    }
 

    public static void main(String args[])   {
               deciToBinary(9279);
    }
}
