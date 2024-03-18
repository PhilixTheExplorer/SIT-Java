import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        sentence = sentence.replaceAll("[!]+", "!");
        sentence = sentence.replaceAll("[?]+", "?");
        sc.close();
        System.out.println(sentence);
    }
}