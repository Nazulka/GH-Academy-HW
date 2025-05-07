package problems.arrays;

import java.util.Scanner;

public class Problem63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            }
        for (int i = 0; i < n; i += 2) { // increment by 2 each time
            System.out.print(arr[i]+ " ");
        }
        }
    }

