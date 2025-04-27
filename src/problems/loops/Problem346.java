package problems.loops;

import java.util.Scanner;

public class Problem346 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int zeros = 0;
        int positives = 0;
        int negatives = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                zeros++;
            } else if (num > 0) {
                positives++;
            } else {
                negatives++;
            }

        }
        System.out.println(zeros + " " + positives + " " + negatives);
    }
}
