import java.util.Scanner;

public class TypeCas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        System.out.println(num);


        // type casting

        int num3 = (int)(67.54f);
        System.out.println(num3);

        // automatic type promotion in expressions

        // int a =257;
        // byte b = (byte)(a);  // 257 % 257 = 1

        // System.out.println(b);


        // byte a = 40;
        // byte b = 50;
        // byte c = 100;

        // int d  = (a*b)/c;

        // System.out.println(d);


        // int number  = 'A';
        // System.out.println(number);
//================================2
        byte b  = 42;
        char c  = 'a';
        short s = 1024;
        int i  = 5000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b) + (i/c) - (d * s);  // float  +  integer - double == double

        System.out.println( (f*b) + " "+(i/c) + " " + (d * s));

// while loop

        int count  = 1;
        while(count != 5){
            System.out.println(count);
            count++;
        }


        }
}