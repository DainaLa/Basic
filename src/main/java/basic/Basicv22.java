package basic;

import java.util.Scanner;

public class Basicv22 {
    public static void main(String[] agrs) {
        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Iveski pirmaji skaiciu");
        int a = numberScanner.nextInt();
        System.out.println("Iveski antraji skaiciu");
        int b = numberScanner.nextInt();

        if((a>30) && (b>30)) {
            System.out.println("Abu ivesti skaiciai yra didesni uz skaiciu 30");
        }else if((a<30) && (b<30)){
            System.out.println("Abu ivesti skaiciai yra mazesni uz skaiciu 30");
        }else if((a==30) && (b==30)){
            System.out.println("Abu ivesti skaiciai yra lygus skaiciui 30");
        }else if((a==30) && (b<30)){
            System.out.println("Pirmas ivestas skaicius yra lygus skaiciui 30, o antras ivestas skaicius yra mazesnis uz skaiciu 30");
        }else if((a==30) && (b>30)){
            System.out.println("Pirmas ivestas skaicius yra lygus skaiciui 30, o antras ivestas skaicius yra didesnis uz skaiciu 30");
        }else if((a<30) && (b==30)){
            System.out.println("Pirmas ivestas skaicius yra mazesnis uz skaiciu 30, o antras ivestas skaicius yra lygus skaiciui 30");
        }else if((a>30) && (b==30)){
            System.out.println("Pirmas ivestas skaicius yra didesnis uz skaiciu 30, o antras ivestas skaicius yra lygus skaiciu 30");
        }else if((a<30) && (b>30)){
            System.out.println("Pirmas ivestas skaicius yra mazesnis uz skaiciu 30, o antras ivestas skaicius yra didesnis uz skaiciu 30");
        }else {
            System.out.println("Pirmas ivestas skaicius yra didesnis uz skaiciu 30, o antras ivestas skaicius yra mazesnis uz skaiciu 30");
        }

        }
    }



