package problems.loops;

import java.util.Scanner;

public class Problem345 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if (num == 0) {
                    sum++;

                }

            }
        System.out.println(sum);
        }
    }