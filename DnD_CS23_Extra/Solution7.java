import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] grid = new int[row][col];
        int clicks = sc.nextInt();
        for (int click = 0; click < clicks; click++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            grid[x][y] = clicked(grid[x][y]);
            if (x > 0)
                grid[x - 1][y] = clicked(grid[x - 1][y]);
            if (y > 0)
                grid[x][y - 1] = clicked(grid[x][y - 1]);
            if (x < row - 1)
                grid[x + 1][y] = clicked(grid[x + 1][y]);
            if (y < col - 1)
                grid[x][y + 1] = clicked(grid[x][y + 1]);
        }
        for (int[] r : grid) {
            for (int x : r) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static int clicked(int value) {
        if (value < 3) {
            value++;
        } else {
            value = 1;
        }
        return value;
    }
}
