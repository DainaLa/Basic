package basic;

import java.util.Scanner;

public class Basicv261 {

    public static void main(String[] agrs) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Uz pieno buteliuka mokekite 2.00 eu");
        double price = inputScanner.nextDouble();

        if (price == 2) {
            System.out.printf("Jus uz pieno buteliuka sumokejote %.2f eu", price);
            System.out.printf(", Grazios dienos. Maloniai laukiame");
        } else if (price > 2) {
            System.out.printf("Jus uz pieno buteliuka sumokejote %s eu", price);
            System.out.printf(", Jusu graza %s eu", price - 2.00);
        } else if (price < 2) {
            System.out.printf("Jus uz pieno buteliuka sumokejote %s eu", price);
            System.out.printf(", Jus turite primoketi %s eu", 2.00 - price);
        }
    }
}


