
public class callByValue3 {

    public static void printHello(String[] args) {
        System.out.println("hello world");
    }

    public static void swap(int a, int b) {
        // swap

        int temp = a;
         a = b;
         b = temp;
       

    }

    public static void main(String[] args) {
    //swap value--
    int a = 5;
    int b = 10;
    swap(a,b);
     System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
