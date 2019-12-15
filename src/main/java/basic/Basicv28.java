package basic;

import com.sun.org.apache.xpath.internal.objects.XBoolean;

import java.util.Scanner;

public class Basicv28 {
    public static void main(String[] args) {
        Scanner tsc = new Scanner(System.in);
        boolean tekstas = true;
        while (tekstas) {
            System.out.println("Iveskite teksta");
            StringBuffer S = new StringBuffer(tsc.nextLine());
            System.out.println("Jusu ivesto teksto atvirscias tekstas yra");
            System.out.println(S.reverse());

            System.out.println("");
            System.out.println("Jei norite testi vel, iveskite zodi TAIP, jei norite isjungti programa, iveskite zodi NE");
            String userAnswer = tsc.nextLine();
            if (userAnswer.equalsIgnoreCase("NE"))
                tekstas = false;
        }
        System.out.println("Viso gero! Iki kito karto!");



        /*Scanner sc = new Scanner(System.in);
        System.out.println("parasykite zodi");
        String S= sc.nextLine();
        String eco =" ";
        for( int i= S.length()-1; i>=0; i--);{
            eco= eco+S.charAt(i);
        }
        System.out.println(eco);*/
    }
}
