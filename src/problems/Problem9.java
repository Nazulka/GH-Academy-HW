package problems;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result  = (a % 2 == 0) ? a + 2 : a + 1;
           System.out.println(result);
    }
}
