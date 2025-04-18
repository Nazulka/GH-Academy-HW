//package problems;

import java.util.Scanner;

public class Problem294 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a; // assume the first number is the biggest

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println(max);
    }
}
