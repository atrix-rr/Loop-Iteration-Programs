import java.util.*;

class Pattern6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Star Pattern");

        int i = 1;

        for (i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}