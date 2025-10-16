import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        int target = sc.nextInt();

        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean found = false;

        // Searching for the target
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == target) {
                    if (!found) {
                        System.out.print("Indices of number " + target + ": ");
                        found = true;
                    }
                    System.out.print("(" + i + "," + j + ") ");
                }
            }
        }

        if (!found) {
            System.out.println("There is no number " + target + " in the matrix.");
        }

        sc.close();
    }
}
