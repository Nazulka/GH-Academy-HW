package problems.loops;

import java.util.Scanner;

public class Problem319 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble(); // real number
        int n = scanner.nextInt();       // natural number

        double sum = 0.0;
        double term = 1.0; // a^0 = 1

        for (int i = 0; i <= n; i++) {
            sum += term;
            term *= a; // compute a^i using previous term
        }

        System.out.println(sum);
    }
}
