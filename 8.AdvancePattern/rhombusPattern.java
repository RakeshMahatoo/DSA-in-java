
public class rhombusPattern {

    public static void main(String[] args) {
        rhombus(5);
    }

    public static void rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            //space

            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            //star
            for (int star = 1; star <= n; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
