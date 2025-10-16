import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();

        int[][][] original = new int[X][Y][Z];

        for (int x = 0; x < X; x++) {
            for (int y = 0; y < Y; y++) {
                for (int z = 0; z < Z; z++) {
                    original[x][y][z] = sc.nextInt();
                }
            }
        }

        // Transpose: swap first two dimensions -> output[Y][X][Z]
        int[][][] transposed = new int[Y][X][Z];

        for (int x = 0; x < X; x++) {
            for (int y = 0; y < Y; y++) {
                for (int z = 0; z < Z; z++) {
                    transposed[y][x][z] = original[x][y][z];
                }
            }
        }

        for (int y = 0; y < Y; y++) {
            for (int z = 0; z < Z; z++) {
                for (int x = 0; x < X; x++) {
                    System.out.print(transposed[y][x][z] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        sc.close();
    }
}
