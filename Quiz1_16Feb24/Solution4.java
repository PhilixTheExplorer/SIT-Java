import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.close();

        int[][] matrix = new int[row][col];
        int count = 1;

        for (int i = 0; i < row + col - 1; i++) {
            if (i % 2 == 0) {
                // Even diagonals (top to bottom)
                for (int j = Math.min(i, row - 1); j >= 0; j--) {
                    int zCol = i - j;
                    if (zCol < col) {
                        matrix[j][zCol] = count++;
                    }
                }
            } else {
                // Odd diagonals (bottom to top)
                for (int j = Math.min(i, col - 1); j >= 0; j--) {
                    int zRow = i - j;
                    if (zRow < row) {
                        matrix[zRow][j] = count++;
                    }
                }
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
