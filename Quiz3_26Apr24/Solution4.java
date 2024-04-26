import java.util.*;

public class Solution4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int days = sc.nextInt();
    String[][] field = new String[20][20];
    for (int day = 0; day < days; day++) {
      int type = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();
      if ((day >= 5 && type == 1) || (day >= 3 && type == 3)) {
        grow(x, y, null, field);
        continue;
      }

      String crop = "";
      switch (type) {
        case 1:
          crop = "T";
          break;
        case 2:
          crop = "L";
          break;
        case 3:
          crop = "S";
          break;
      }
      field[x][y] = crop;
      grow(x, y, crop, field);
    }
    sc.close();
    int t = 0;
    int l = 0;
    int s = 0;
    for (int i = 0; i < 20; i++) {
      for (int j = 0; j < 20; j++) {
        if (field[i][j] != null) {
          if ((field[i][j]).equals("T")) t++; else if (
            (field[i][j]).equals("L")
          ) l++; else if ((field[i][j]).equals("S")) s++;
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

  private static void grow(int x, int y, String crop, String[][] field) {
    for (int i = x - 1; i <= x + 1; i++) {
      for (int j = y - 1; j <= y + 1; j++) {
        if (isValid(i, j)) {
          field[i][j] = crop;
        }
      }
    }
  }
}
