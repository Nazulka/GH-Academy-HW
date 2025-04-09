package problems;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = (a / 100) % 10;
        int c = a % 10;
        int d = (a / 10) % 10;

        int result = b + c + d;

        System.out.println(result);

    }
}
