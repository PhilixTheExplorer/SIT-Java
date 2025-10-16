import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int depth = sc.nextInt();
        int days = sc.nextInt();
        int[][][] field = new int[row][col][depth];

        for (int day = 0; day < days; day++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            /*
             * --No initial grass in day 1--
             * so, first 2 for-loops show no effect in day 1
             * Mark grass cell as -->1
             * 
             * --From day 2--
             * first triple for-loop checks for normal grass cell
             * -if found, check neighnour cell-
             * if neighbour is already grass cell, leave as it is-->1
             * unless, neighbour cells as neighbour grass cell-->2
             * 
             * second triple for-loop is to update-->
             * neighbour grass cells back to normal grass cell
             * --Used Sir Ant's Implementation--
             */
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    for (int k = 0; k < depth; k++) {
                        // Check grass cell
                        if (field[i][j][k] == 1) {
                            /*
                             * Check neighbour cells
                             * Control flow is to avoid Index out of bound
                             * 
                             * Ternary Operator is for-->
                             * if grass cell, leave as it is-->1
                             * unless, mark as -->2
                             */
                            if (i > 0)
                                field[i - 1][j][k] = field[i - 1][j][k] == 1 ? 1 : 2;
                            if (j > 0)
                                field[i][j - 1][k] = field[i][j - 1][k] == 1 ? 1 : 2;
                            if (k > 0)
                                field[i][j][k - 1] = field[i][j][k - 1] == 1 ? 1 : 2;
                            if (i < row - 1)
                                field[i + 1][j][k] = field[i + 1][j][k] == 1 ? 1 : 2;
                            if (j < col - 1)
                                field[i][j + 1][k] = field[i][j + 1][k] == 1 ? 1 : 2;
                            if (k < depth - 1)
                                field[i][j][k + 1] = field[i][j][k + 1] == 1 ? 1 : 2;
                        }
                    }
                }
            }
            // Update neighbour grass cell to normal grass cell
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    for (int k = 0; k < depth; k++) {
                        if (field[i][j][k] == 2) {
                            field[i][j][k] = 1;
                        }
                    }
                }
            }
            // mark grass cell as 1
            field[x][y][z] = 1;
        }
        sc.close();

        int totalCells = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < depth; k++) {
                    if (field[i][j][k] == 1) {
                        totalCells++;
                    }
                }
            }
        }
        System.out.println(totalCells);
    }

}