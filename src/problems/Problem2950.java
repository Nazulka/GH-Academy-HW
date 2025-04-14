package problems;

import java.util.Scanner;

public class Problem2950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pounds = sc.nextInt();
        int pence = sc.nextInt();
        int n = sc.nextInt();
        int total = (pounds * 100 + pence)*n;
        int totalPounds = total / 100;
        int totalPence = total % 100;

        System.out.println(totalPounds + " " + totalPence);
    }
}
