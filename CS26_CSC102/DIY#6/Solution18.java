
/*
 * A pangram is a string that contains every letter of the English alphabet at
 * least once. Your task is to determine whether a given sentence is a pangram.
 * Ignore case sensitivity. Return "pangram" if the sentence is a pangram and
 * "not pangram" otherwise.
 * 
 * Input:
 * 
 * A single line containing the input string 𝑠. Each character of the string 𝑠
 * will be an ASCII character.
 * Output:
 * 
 * Return the string "pangram" if the input string is a pangram; otherwise,
 * return "not pangram".
 */
import java.util.Scanner;
import java.util.HashSet;

public class Solution18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        HashSet<Character> letters = new HashSet<>();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.add(c);
            }
        }

        if (letters.size() == 26) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not Pangram");
        }

        sc.close();
    }
}