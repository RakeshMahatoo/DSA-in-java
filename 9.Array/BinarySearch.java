import  java.util.*;
public class BinarySearch {
    public static void main(String args[]){
          int num[] = {2,4,6,8,10,12,14};
          int key = 25;
          
          
          int result = BinarySearch(num, key);
          System.out.println("Element found at index: " + result);
    }

    public static int BinarySearch(int num[], int  key) {
        int start = 0;
        int end = num.length - 1;
        while(start<=end){
            int mid = (start + end) / 2;

            // Check if key is present at mid
            if(num[mid]==key){
                return mid; // Key found, return index
            }
            if(num[mid]<key){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return -1; // Key not found, return -1

    }          
}
