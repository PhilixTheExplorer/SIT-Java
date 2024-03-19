import java.util.Scanner;

public class rotateAntiClockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * Dimension should be square NxN matrix
         * unless, index out of bound error
         */
        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.close();
        int[][] matrix = new int[row][col];

        /*
         * Populating matrix here
         * We can also receive matrix as user input
         */
        int count = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = count++;
            }
        }
        /*
         * Rotate anticlockwise and print
         */
        for (int i = row - 1; i >= 0; i--) {
            for (int j = 0; j <= col - 1; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

        /*
         * --The following logic is the idea of-->
         * -->no extra matrix or space
         * --transpose matrix first--
         * --then, swap the rows --
         * --then, print the result matrix--
         */

        // for (int i = 0; i < row; i++) {
        // for (int j = i + 1; j < col; j++) {
        // int tmp = matrix[i][j];
        // matrix[i][j] = matrix[j][i];
        // matrix[j][i] = tmp;
        // }
        // }

        // for (int first = 0, last = row - 1; first < last; first++, last--) {
        // int[] tmp = matrix[first];
        // matrix[first] = matrix[last];
        // matrix[last] = tmp;
        // }

        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < col; j++) {
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();
        // }

    }
}
