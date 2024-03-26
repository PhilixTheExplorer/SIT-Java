import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int click = sc.nextInt();

        int[][] field = new int[r][c];

        for (int i = 0; i < click; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            field[x][y] += 1;
            if (x - 1 >= 0)
                field[x - 1][y] += 1;
            if (x + 1 < r)
                field[x + 1][y] += 1;
            if (y - 1 >= 0)
                field[x][y - 1] += 1;
            if (y + 1 < c)
                field[x][y + 1] += 1;

        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();

    }
}