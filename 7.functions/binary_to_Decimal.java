
public class binary_to_Decimal {

    // public static void binaryToDec(int binNum) {
    //     int myNum = binNum;
    //     int pow = 0;
    //     int decNum = 0;
    //     while(binNum > 0){
    //       int lastDigit = binNum %  10;
    //       decNum = decNum +(lastDigit * (int)Math.pow(2,pow));  // Type cast
    //       pow++;
    //       binNum = binNum / 10;
    //     }
    //     System.out.println("decimal of" + myNum + " =" + decNum);
    // }
    //   public static void main(String[] args) {
    //        binaryToDec(101);
    //   }
    public static void binaryToDec(int binNum) {
      int myNum = binNum;
     int decNum = 0;
     int lastDigit=0;
     int pow = 0;
      for(; binNum>0 ;){
        lastDigit = binNum % 10;
        decNum = decNum + lastDigit * (int)(Math.pow(2,pow));
        pow++;
        binNum = binNum/10;
      }
             
        System.out.println("Decimal number of " + myNum + " is " + decNum);
    }



    public static void main(String[] args) {
        binaryToDec(101); 
    }

}
