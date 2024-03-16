import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int delRow = sc.nextInt();
        int delCol = sc.nextInt();
        int[][] originalMatrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                originalMatrix[i][j] = sc.nextInt();
            }
        }
        int newRow = row - 1;
        int newCol = col - 1;
        int[][] newMatrix = new int[newRow][newCol];
        int addRow = 0;
        for (int i = 0; i < row; i++) {
            if (i == delRow)
                continue;
            int addCol = 0;
            for (int j = 0; j < col; j++) {
                if (j != delCol)
                    newMatrix[addRow][addCol++] = originalMatrix[i][j];
            }
            addRow++;
        }

        for (int i = 0; i < newCol; i++) {
            for (int j = 0; j < newRow; j++) {
                System.out.print(newMatrix[j][i] + " ");
            }
        }
    }
}