import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bomb = sc.nextInt();

        int[][] field = new int[20][20];

        for (int i = 0; i < bomb; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            /*
             * We need to consider
             * the bomb coordinate can be repeated
             * if 1 1 is bomb and we increase the neighbour cells
             * when 1 1 comes again, no need to increase the neighbours again
             */
            if (field[x][y] != -1) {
                field[x][y] = -1;
                /*
                 * The bomb coordinate is -1
                 * The neighbour cells are increased by 1 except the ones with bomb
                 * It looks like a 3x3 Matrix
                 * --Used Shine's Explanation Here--
                 */
                for (int row = x - 1; row <= x + 1; row++) {
                    for (int col = y - 1; col <= y + 1; col++) {
                        if (isValidCell(row, col) && field[row][col] != -1) {
                            field[row][col] += 1;
                        }
                    }
                }
            }

        }
        sc.close();

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }

    }

    /*
     * To avoid index out of bound error
     * We first check the cell to be valid
     * --The idea comes from Lab4_Q7_ToggleProblem--
     */
    static boolean isValidCell(int row, int col) {
        return row >= 0 && col >= 0 && row < 20 && col < 20;
    }
}
