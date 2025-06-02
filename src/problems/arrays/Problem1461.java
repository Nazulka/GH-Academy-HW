package problems.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1461 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  // Number of test cases
        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            List<Integer> balls = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                balls.add(sc.nextInt());
            }

            int totalDestroyed = countDestroyedBalls(balls);
            System.out.println(totalDestroyed);
        }
    }

    private static int countDestroyedBalls(List<Integer> balls) {
        int totalDestroyed = 0;

        while (true) {
            boolean removedAny = false;
            int i = 0;

            while (i < balls.size()) {
                int j = i + 1;

                while (j < balls.size() && balls.get(j).equals(balls.get(i))) {
                    j++;
                }

                int chainLength = j - i;

                if (chainLength >= 3) {
                    for (int k = j - 1; k >= i; k--) {
                        balls.remove(k);
                    }
                    totalDestroyed += chainLength;
                    removedAny = true;
                    break;  // restart after modification
                } else {
                    i = j;
                }
            }

            if (!removedAny) {
                break;
            }
        }

        return totalDestroyed;
    }
}
