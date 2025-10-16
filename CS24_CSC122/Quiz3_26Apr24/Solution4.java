import java.util.*;

public class Solution4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int days = sc.nextInt();
    int[][] field = new int[20][20];
    for (int day = 1; day <= days; day++) {
      int type = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();
      int dayLeft = 10 - day;

      if (
        (dayLeft < 5 && type == 1) ||
        (dayLeft < 3 && type == 2) ||
        (dayLeft < 7 && type == 3)
      ) {
        grow(x, y, 0, field);
        continue;
      }
      grow(x, y, type, field);
    }
    sc.close();
    int t = 0;
    int l = 0;
    int s = 0;
    for (int i = 0; i < 20; i++) {
      for (int j = 0; j < 20; j++) {
        switch (field[i][j]) {
          case 1 -> t++;
          case 2 -> l++;
          case 3 -> s++;
          default -> {}
        }
      }
    }
    System.out.println("Tomato: " + t);
    System.out.println("Leek: " + l);
    System.out.println("Strawberry: " + s);
  }

  private static boolean isValid(int x, int y) {
    return x >= 0 && x < 20 && y >= 0 && y < 20;
  }

  private static void grow(int x, int y, int crop, int[][] field) {
    for (int i = x - 1; i <= x + 1; i++) {
      for (int j = y - 1; j <= y + 1; j++) {
        if (isValid(i, j)) {
          field[i][j] = crop;
        }
      }
    }
  }
}
