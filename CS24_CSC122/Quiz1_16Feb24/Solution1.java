import java.util.Scanner;

public class Solution1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String password = sc.next();
    boolean isValid = false;
    if (password.length() >= 8 && password.length() <= 15) {
      boolean containsLowerCase = false;
      boolean containsUpperCase = false;
      boolean containsDigit = false;
      boolean containsSpecialChar = false;

      String specialChars = "@#%&!$*";

      for (char ch : password.toCharArray()) {
        if (Character.isLowerCase(ch)) containsLowerCase = true;
        else if (Character.isUpperCase(ch)) containsUpperCase = true;
        else if (Character.isDigit(ch)) containsDigit = true;
        else if (specialChars.indexOf(ch) != -1) containsSpecialChar = true;
      }

      if (
        containsLowerCase &&
        containsUpperCase &&
        containsDigit &&
        containsSpecialChar
      ) isValid = true;
    }
    sc.close();
    System.out.println(isValid);
  }
}
