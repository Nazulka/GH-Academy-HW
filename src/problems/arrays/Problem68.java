package problems.arrays;

import java.util.Scanner;

public class Problem68 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largerThanNeighbours = 0;

        for (int i = 1; i < n-1; i++) {
            if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                largerThanNeighbours++;
            }
        }
            System.out.println(largerThanNeighbours);


        }
}
