package problems.loops;

import java.util.Scanner;

public class Problem335 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            int sqrt = (int) Math.sqrt(i);
            if (sqrt * sqrt == i) {
                System.out.print(i + " ");
            }
        }
    }
}
