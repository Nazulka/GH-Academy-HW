package problems;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int t = sc.nextInt();
        if (v > 0) {
            int result = 109 - (v * t);
            result = Math.abs(result);
            System.out.println(result);
        } else {
            int result = 109 - (-v) * t;
            System.out.println(result);
        }
    }
}
