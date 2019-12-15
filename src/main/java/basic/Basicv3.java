package basic;

import java.util.Scanner;

public class Basicv3 {
    public static void main(String[] agrs) {
        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Ivesk sveika skaiciu a");
        int a = numberScanner.nextInt();
        double m= a;
        System.out.println("Ivesk sveika skaiciu b");
        int b = numberScanner.nextInt();
        double n = b;
        double c = m / n;
        System.out.printf("%.3f%n", c);
    }
}