
public class invertedRotatedHalfPyramid {

    public static void main(String[] args) {
        inverted_rotated_half_pyramid(4);

    }

    public static void inverted_rotated_half_pyramid(int n) {
        //outer
        for (int i = 1; i <= n; i++) {

            //space
            for (int j = 1; j <= n - i; j++) {      // 4-1 = 3

                System.out.print(" ");
            }

            // starts
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
