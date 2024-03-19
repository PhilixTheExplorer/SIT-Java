import java.util.Scanner;

public class spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.close();

        int[][] matrix = new int[row][col];
        /*
         * if we want to receive input matrix
         * we can change input matrix to 1D array first
         * then, use count variable as index of 1D array
         */
        int count = 1;

        int top = 0, bottom = row - 1;
        int left = 0, right = col - 1;
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

        // Printing matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}