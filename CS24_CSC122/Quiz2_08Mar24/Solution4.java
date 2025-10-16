import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        sc.close();

        int top = 0, bottom = row - 1;
        int left = 0, right = col - 1;
        int count = 1;
        while (top <= bottom && left <= right) {
            // Print top row
            for (int i = left; i <= right; i++) {
                matrix[top][i] = count++;
            }
            top++;

            // Print rightmost column
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = count++;
            }
            right--;

            /*
             * top row and right column no need conditions to check
             * but bottom row and left column run under certain conditions
             */

            // Print bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = count++;
                }
                bottom--;
            }

            // Print leftmost column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = count++;
                }
                left++;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}