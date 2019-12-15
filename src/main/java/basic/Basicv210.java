package basic;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;
import java.util.Scanner;

public class Basicv210 {
    private static String[] mas = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "y", "j", "k", "l", "m", "o", "p", "r", "s", "t", "u", "v", "z"};

    public static void main(String[] args) {

        Random random = new Random();
        int longest = 0;
        String length = "";

        for (int i = 0; i <= 2; i++) {
            int sk = random.nextInt(5);
            String max = "";

            for (int a = 0; a <= sk; a++) {
                int sk1 = random.nextInt(mas.length);
                max = max + mas[sk1];
            }
            System.out.println(max);
            if (longest < max.length()) {
                longest = max.length();
                length = max;
            }
        }
        System.out.println("Ilgiausia atsitiktiniu elementu seka: " + length + ", elementu kiekis: " + length.length());
    }
}

















