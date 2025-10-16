import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Selection sort algorithm to sort the array in ascending order
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i; // Assume the current index is the minimum

            // Find the index of the smallest element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[min_idx]) {
                    min_idx = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = nums[i];
            nums[i] = nums[min_idx];
            nums[min_idx] = temp;
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
        sc.close();
    }
}