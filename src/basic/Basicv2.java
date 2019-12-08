package basic;

import java.util.Scanner;

public class Basicv2 {

    public static void main(String[] agrs) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Ivesk skaiciu su trim ir daugiau skaiciais po kablelio");
        double skaicius = inputScanner.nextDouble();
        System.out.printf("%.2f",skaicius);
    }
}