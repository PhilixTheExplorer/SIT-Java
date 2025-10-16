import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] cube = new int[5][5][5];
        int bombs = sc.nextInt();
        for (int bomb = 0; bomb < bombs; bomb++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            for (int i = 0; i < 5; i++)
                cube[i][y][z] = 1;
            for (int j = 0; j < 5; j++)
                cube[x][j][z] = 1;
            for (int k = 0; k < 5; k++)
                cube[x][y][k] = 1;
        }

        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    count += cube[i][j][k];
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}