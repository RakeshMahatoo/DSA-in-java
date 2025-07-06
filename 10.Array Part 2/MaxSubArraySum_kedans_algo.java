public class MaxSubArraySum_kedans_algo {
    public static void main(String[] args) {
         int numbers[] = {-2,-3, 4, -1, -2, 1, 5, -3};
        kedans(numbers);
    }

    public static void kedans(int numbers[]) {
        int current = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length;i++){
            current = current + numbers[i];
            if(current<0){
                current=0;         //if curr is smaller than 0 then store 0 in current, we dont want -ve value in current
            }
            max = Math.max(current, max);  // current and max mein jo bhi bara hoga wo max mein store ho jaye.
            System.out.println("the max is: " + max);
        }
        System.out.println("the max sum of value in array is" + max);
    }
}