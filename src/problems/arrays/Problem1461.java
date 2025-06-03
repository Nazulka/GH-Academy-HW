package problems.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1461 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> balls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            balls.add(sc.nextInt());
        }

        int totalDestroyed = countDestroyedBalls(balls);
        System.out.println(totalDestroyed);
    }

    private static int countDestroyedBalls(List<Integer> balls) {
        int totalDestroyed = 0;

        boolean keepChecking = true;
        while (keepChecking) {
            keepChecking = false;
            int i = 0;

            while (i < balls.size()) {
                int j = i + 1;

                // Expand j to find the end of the current group
                while (j < balls.size() && balls.get(j).equals(balls.get(i))) {
                    j++;
                }

                int groupSize = j - i;

                if (groupSize >= 3) {
                    // Remove the group from right to left
                    for (int k = j - 1; k >= i; k--) {
                        balls.remove(k);
                    }
                    totalDestroyed += groupSize;
                    keepChecking = true;
                    break; // Restart entire process from beginning
                } else {
                    i = j;
                }
            }
        }

        return totalDestroyed;
    }
}
