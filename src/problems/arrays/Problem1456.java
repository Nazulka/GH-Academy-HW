package problems.arrays;

import java.util.Scanner;

public class Problem1456 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int petyasheight = sc.nextInt();
        int position = 1;
        for (int i = 0; i < n; i++) {

            if (arr[i] >= petyasheight) {
                position++;
            }

        }System.out.print(position);

    }
}
