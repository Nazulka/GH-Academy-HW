package problems;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("The next number for the number " + a + " is " + (a+1) +".");
        System.out.println("The previous number for the number " + a + " is " + (a-1) +".");
    }
}
