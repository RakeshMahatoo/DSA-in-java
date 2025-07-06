

public class maxSubArraySum_Prefix_method {

    public static void main(String[] args) {
        int number[] = {1, -2, 6, -1, 3};
        printArray(number);
    }

    public static void printArray(int number[]) {
        int cumSum = 0;
        int maxNum = Integer.MIN_VALUE;

        
        int prefix[] = new int[number.length];
        prefix[0]=number[0];

        //calculate prefix

        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + number[i];
        }

        for(int i=0; i<number.length;i++){
            for(int j=i; j<number.length;j++){
                cumSum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
            }
            if(cumSum>maxNum){
                maxNum = cumSum;
            }
        }
        System.out.println("max number is: " + maxNum);


        
        
    }
}
