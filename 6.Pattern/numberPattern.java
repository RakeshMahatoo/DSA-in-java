

public class numberPattern {
    public static void main(String[] args) {
        int n=4;
        int num = 1;
        for(int line = 1; line<=n; line++){
            for(int chr= 1; chr<=line; chr++){
                 System.out.print(num+ " ");
                 num++;
            }
            System.out.println();
        }
    }
}
