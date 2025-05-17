package problems.arrays;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of elements: ");
            int size = sc.nextInt();

            int[] nums = new int[size];
            System.out.println("Enter the elements:");
            for (int i = 0; i < size; i++) {
                nums[i] = sc.nextInt();
            }

            System.out.print("Enter the target sum: ");
            int target = sc.nextInt();

            int[] result = twoSum(nums, target);

            if (result != null) {
                System.out.println("Indices: " + result[0] + ", " + result[1]);
            } else {
                System.out.println("No two numbers found that add up to the target.");
            }

            sc.close();
        }

        public static int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return null; // No valid pair found
        }
    }

