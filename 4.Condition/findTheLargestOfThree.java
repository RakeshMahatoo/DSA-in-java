public class findTheLargestOfThree {
    public static void main(String[] args) {
     
        int A=1, B=3, C=6;
        if((A >= B) && (A >= C)) {
            System.out.println("A is the largest");
        } else if((B >= A) && (B >= C)) {
            System.out.println("B is the largest");
        } else {
            System.out.println("C is the largest");
        }
    }
}
  