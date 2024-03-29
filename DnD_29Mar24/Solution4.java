import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int days = sc.nextInt();
        int[][] garden = new int[row][col];
        for (int day = 0; day < days; day++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (garden[i][j] == 1) {
                        if (i > 0)
                            garden[i - 1][j] = garden[i - 1][j] == 1 ? 1 : 2;
                        if (j > 0)
                            garden[i][j - 1] = garden[i][j - 1] == 1 ? 1 : 2;
                        if (i < row - 1)
                            garden[i + 1][j] = garden[i + 1][j] == 1 ? 1 : 2;
                        if (j < col - 1)
                            garden[i][j + 1] = garden[i][j + 1] == 1 ? 1 : 2;
                    }
                }
            }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (garden[i][j] == 2) {
                        garden[i][j] = 1;
                    }
                }
            }
            garden[x][y] = 1;
        }
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (garden[i][j] == 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}