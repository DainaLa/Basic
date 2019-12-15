package basic;

import java.util.Scanner;

public class Basicv262 {

    public static void main(String[] agrs) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Kiek Jums metu?");
        int agea = inputScanner.nextInt();

        if (agea >= 21) {
            System.out.println("Jus galite pirkti alkoholi");
            System.out.printf("Uz vyno buteli mokekite 35 eu");

            double price = inputScanner.nextDouble();
            if (price == 35) {
                System.out.printf("Jus uz vyna sumokejote %.2f eu", price);
                System.out.printf(", Grazios dienos. Maloniai laukiame vel");
            } else if (price > 35) {
                System.out.printf("Jus uz vyna sumokejote %s eu", price);
                System.out.printf(", Jusu graza %s eu", price - 35.00);
            } else if (price < 35) {
                System.out.printf("Jus uz vyna sumokejote %s eu", price);
                System.out.printf(", Jus turite primoketi %s eu", 35.00 - price);
            }
        } else {
            System.out.println("Jus negalite pirkti alkoholio");
        }

    }
}