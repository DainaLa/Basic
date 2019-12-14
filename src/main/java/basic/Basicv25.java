package basic;

public class Basicv25 {
    public static void main(String[] args) {
        int n = 7;
        System.out.println("EGLUTE");

        for (int x = 1; x <= n; x++) {
            for (int y = n - x; y > 0; y--) {
                System.out.print(" ");
            }
            for (int y = 1; y <= x; y++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("STACIAKAMPIS");

        for (int x = 0; x < 7; x++) {
            for (int y = 0; y < 7; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("KVADRATAS");
        for (int x = 1; x <= n; x++) {
            for (int y = n - x; y > 0; y--) {
                System.out.print(" * ");
            }
            for (int y = 1; y <= x; y++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}




