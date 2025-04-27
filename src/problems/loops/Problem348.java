package problems.loops;

import java.util.Scanner;

public class Problem348 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        for (int x = 0; x <= 1000; x++) {
            int result = a*x*x*x+b*x*x+c*x+d;
            if (result == 0) {
                System.out.println(x + " ");
            }
        }

    }
}
