package basic;

import java.util.Scanner;

public class Basicv11<skaicius> {
    public static void main(String[] agrs) {
        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Ivesk skaiciu");
        int x = numberScanner.nextInt();

        switch (x) {
            case 30:
                System.out.println("ivestas skaicius lygus0 30");
                break;
        }
        System.out.println(x >= 30 ? x > 30 : "ivestas skaicius mazesnis uz 30");
        System.out.println(x <= 30 ? x < 30 : "ivestas skaicius didesnis uz 30");


    }
}
