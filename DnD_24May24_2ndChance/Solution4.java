import java.util.*;

public class Solution4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();
    int[][] arr = new int[row][col];
    for (int i = 0; i < row; i++) for (int j = 0; j < col; j++) arr[i][j] = sc.nextInt();

    int x = sc.nextInt();
    int y = sc.nextInt();
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (i == x && j == y) {
          arr[i][j] = (arr[i][j] == 1) ? 0 : 1;
          if (isValid(i + 1, j, row, col)) arr[i + 1][j] = (arr[i + 1][j] == 1) ? 0 : 1;
          if (isValid(i - 1, j, row, col)) arr[i - 1][j] = (arr[i - 1][j] == 1) ? 0 : 1;
          if (isValid(i, j + 1, row, col)) arr[i][j + 1] = (arr[i][j + 1] == 1) ? 0 : 1;
          if (isValid(i, j - 1, row, col)) arr[i][j - 1] = (arr[i][j - 1] == 1) ? 0 : 1;
        }
      }
    }
    for (int[] i : arr) for (int j : i) System.out.print(j + " ");
    sc.close();
  }

  public static boolean isValid(int x, int y, int row, int col) {
    return (x >= 0 && x < row && y >= 0 && y < col);
  }
}
