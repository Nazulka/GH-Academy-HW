//package problems;

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hours = (n/3600)%24;
        int minutes = (n%3600)/60;
        int seconds = n%60;
        String formatedTime = String.format("%2d:%02d:%02d", hours, minutes, seconds);
        System.out.println(formatedTime);

    }
}
