package basic;

import java.util.Random;

public class Basicv29 {
    public static void main(String[] args) {
        Random mas=new Random();
            int[] a = new int[10];
            System.out.println("Atsitiktine masyvu eilute");
            for(int i=0; i< 10; i++){
                a[i]=mas.nextInt(10);
                System.out.print(a[i]);
        }
      // int[] a = {-7, -2, 0, -61, -25, -5, -9, -30, -1};
        int max = a[0];
        int i;
        for (i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("Didziausias skaicius is pateiktos masyno eilutes yra:"+max);
    }
}

