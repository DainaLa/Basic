package basic;

import java.util.Scanner;

public class Basicv27 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean check = true;
        double number1;
        double number2;
        double result;

        do {
            System.out.println("iveskite pimaji skaiciu");
            number1 = scan.nextDouble();
            System.out.println("iveskite antraji skaiciu");
            number2 = scan.nextDouble();

            if ((number1 == 0 || number2 == 0)) {
                System.out.println("Dalyba is nulio negalima");
                check = false;
            }
            if ((number1 != 0) && (number2 != 0)) {
                result = number1 / number2;
                System.out.printf("Rzultatas %.4f", result);
                System.out.println();
            }
        }while ((check)) ;
    }
}

