package problems.arrays;

import java.util.Scanner;

public class Problem67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean hasSameSignPair = false;

        for (int i = 1; i < n; i++) {
            if ((arr[i - 1] > 0 && arr[i] > 0) || (arr[i - 1] < 0 && arr[i] < 0)) {
                hasSameSignPair = true;
                break;
            }
        }

        if (hasSameSignPair) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
