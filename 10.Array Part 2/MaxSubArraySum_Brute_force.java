public class MaxSubArraySum_Brute_force {
    public static void main(String[] args) {
        int number[] = {2, -2, 6, -1, 3};
        printArray(number);
    }

    public static void printArray(int number[]) {
       int curSum=0;
        int maxNum = Integer.MIN_VALUE;
       for(int i=0;i<number.length;i++){
        for(int j=i; j<number.length;j++){
            curSum = 0;
            for(int k=i; k<=j; k++){
                curSum = curSum + number[k];
            }
            System.out.println("The Substring of array " + i + " and " + j + " is " + curSum);
        }
        if(curSum > maxNum){
            maxNum = curSum;
        }
    }
    System.out.println("max sum is " + maxNum);
    }
}
