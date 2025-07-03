public class largesNumber {
    public static void main(String[] args) {
        int num[] = {7,1,4,6,8,7,4,10};
      int  result = largesNumber(num);
      System.out.println("the largest number in array is: " + result);

    }
    public static int largesNumber(int[] num) {
       // int largest = num[0]; 
       int largest = Integer.MIN_VALUE;
             int smallest = Integer.MAX_VALUE;

        for(int i=0 ; i<num.length; i++){
            if(num[i] > largest){
                largest = num[i];
            }
            if(num[i]< smallest){
                smallest = num[i];
            }
        }
        System.out.println("The smallest value is"+ smallest);
        return largest;
    }
}




