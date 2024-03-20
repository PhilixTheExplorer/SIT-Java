import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bomb = sc.nextInt();
        int[][] field = new int[10][10];
        for (int b = 0; b < bomb; b++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            field[x][y] = 1;
            for (int i = x - 1; i <= x + 1; i++) {
                for (int j = y - 1; j <= y + 1; j++) {
                    if (i >= 0 && i < 10 && j >= 0 && j < 10 && field[i][j] != 1) {
                        field[i][j] = 1;
                    }
                }
            }
        }
        sc.close();
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (field[i][j] == 1)
                    count++;
            }
        }
        System.out.println(count);
    }
}
