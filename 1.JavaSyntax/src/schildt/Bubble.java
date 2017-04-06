package schildt;

public class Bubble {
    public static void main(String[] args) {
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};

        printArray(nums, "Исходный массив:");

        for (int a = 1; a < nums.length; a++) {
            for (int b = nums.length - 1; b >= a; b--) {
                if (nums[b - 1] > nums[b]) {
                    int t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        }

        printArray(nums, "Отсортированный массив:");
    }

    private static void printArray(int[] nums, String message) {
        System.out.print(message);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" " + nums[i]);
        }
        System.out.println();
    }
}
