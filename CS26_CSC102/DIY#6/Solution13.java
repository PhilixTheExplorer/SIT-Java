import java.util.Scanner;

public class Solution13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int num = 1;

        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        // Phase 1: Top row - Left to Right
        for (int j = left; j <= right; j++) {
            matrix[top][j] = num++;
        }
        top++;

        // Phase 2: Rightmost column - Top to Bottom
        for (int i = top; i <= bottom; i++) {
            matrix[i][right] = num++;
        }
        right--;

        // Custom loop: bottom row right-to-left, then next bottom row left-to-right
        while (top <= bottom) {
            // Phase 3: Bottom row - Right to Left
            for (int j = right; j >= left; j--) {
                matrix[bottom][j] = num++;
            }
            bottom--;

            // Phase 4: Next row up - Left to Right
            if (top <= bottom) {
                for (int j = left; j <= right; j++) {
                    matrix[bottom][j] = num++;
                }
                bottom--;
            }
        }

        // Output the matrix
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
