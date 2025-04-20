package problems;

import java.util.Scanner;

public class Problem259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = (k + 4) / 4;
        if ((k + 4) % 4 == 0 && (k + 4) / 4 >= 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
