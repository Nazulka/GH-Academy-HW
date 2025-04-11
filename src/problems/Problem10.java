package problems;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int time = (n/60)%24;
        int minutes = n%60;
        System.out.println(time + " " + minutes);
    }

}
