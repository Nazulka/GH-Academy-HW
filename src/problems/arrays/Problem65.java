package problems.arrays;

import java.util.Scanner;

public class Problem65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                sum++;

            }
        }
        System.out.println(sum);
    }
}
