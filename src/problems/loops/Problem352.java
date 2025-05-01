package problems.loops;

import java.util.Scanner;

public class Problem352 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = 1;

        // Multiply 2, N times
        for (int i = 0; i < n; i++) {
            result *= 2;
        }

        System.out.println(result);
    }
}
