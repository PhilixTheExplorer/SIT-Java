import java.util.Scanner;

public class DNAPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strand = sc.nextLine();
        int n = strand.length();

        for (int i = 0; i < n; i++) {
            int space = 3 - Math.abs((i % 7) - 3);
            System.out.print(" ".repeat(space));
            System.out.println(strand.charAt(i) + " - - " + getPair(strand.charAt(i)));
        }
    }

  //HashMap is also ok
    public static char getPair(char c) {
        if (c == 'A')
            return 'T';
        if (c == 'T')
            return 'A';
        if (c == 'C')
            return 'G';
        if (c == 'G')
            return 'C';
        return '-';
    }

}
