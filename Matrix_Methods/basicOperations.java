import java.util.Arrays;

public class basicOperations {
    public static void fill2DMatrix(int[][] matrix, int fillValue) {
        for (int[] row : matrix) {
            Arrays.fill(row, fillValue);
        }
    }

    public static int[][] generate2DMatrix(int row, int col) {
        int[][] matrix = new int[row][col];
        int count = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = count++;
            }
        }
        return matrix;
    }

    public static int[] generate1DArray(int size) {
        int[] arr = new int[size];
        int count = 1;
        for (int i = 0; i < size; i++) {
            arr[i] = count++;
        }

        return arr;
    }

    public static void print2DMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void print1DArray(int[] array) {
        for (int x : array) {
            System.out.print(x + " ");
        }
    }
}
