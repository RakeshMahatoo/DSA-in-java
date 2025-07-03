public class DiamondPattern {
    public static void main(String[] args) {
        diamond(4); // You can change the value to test with other inputs
    }

    public static void diamond(int n) {
        // Top half including middle line
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            // Print stars
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom half
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            // Print stars
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
