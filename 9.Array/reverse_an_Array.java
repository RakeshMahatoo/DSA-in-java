import java.util.*;
public class reverse_an_Array {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,5,6,7,8,9};
        System.out.println("Original Array: " + Arrays.toString(arr));
        int first = 0;
        int last = arr.length - 1;
        while(first<last){
            // swap element s
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;

        }
        System.out.println("Reversed Array: ");
        for(int i=0 ; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

}
}


