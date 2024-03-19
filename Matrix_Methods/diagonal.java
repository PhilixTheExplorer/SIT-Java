import java.util.Scanner;

public class diagonal {
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
        for (int k = 0; k < row + col - 1; k++) {
            int startRow = Math.min(k, row - 1);
            int startCol = Math.max(0, k - row + 1);

            for (int i = startRow, j = startCol; i >= 0 && j < col; i--, j++) {
                matrix[i][j] = count++;
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
