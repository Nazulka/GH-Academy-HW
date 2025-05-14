package problems.arrays;

import java.util.Scanner;

public class Problem73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int unique =1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i-1]) {
                unique++;

        }

        } System.out.println(unique);

    }
}
