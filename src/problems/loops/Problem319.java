//package problems.loops;

import java.util.Scanner;

public class Problem319 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int sum = 0;
        int term = 1;

        for (int i = 0; i <= n; i++) {
            sum += term;
            term *= 2;
        }

        System.out.println(sum);
    }
}
