import java.util.*;

public class Solution4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String curState = sc.nextLine();
    String click = sc.nextLine();
    String nextState = "";
    switch (curState) {
      case "0 0" -> {
        nextState =
          switch (click) {
            case "- 1" -> "DnD";
            case "1 -" -> "MuR";
            default -> "NEUTRAL";
          };
      }
      case "1 0" -> {
        nextState =
          switch (click) {
            case "- 1" -> "DnD";
            case "1 -" -> "NEUTRAL";
            default -> "MuR";
          };
      }
      case "0 1" -> {
        nextState =
          switch (click) {
            case "- 1" -> "NEUTRAL";
            case "1 -" -> "MuR";
            default -> "DnD";
          };
      }
      default -> {}
    }
    System.out.println(nextState);
    sc.close();
  }
}
