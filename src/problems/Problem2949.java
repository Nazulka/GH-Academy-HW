package problems;

import java.util.Scanner;

public class Problem2949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = a; //9
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);

    }
}
