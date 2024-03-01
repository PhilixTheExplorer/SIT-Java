import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] cube = new int[5][5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    cube[i][j][k] = 1;
                }
            }
        }

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            toggle(cube, x, y, z);
        }

        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if (cube[i][j][k] == -1) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    private static void toggle(int[][][] cube, int x, int y, int z) {
        cube[x][y][z] *= -1;

        toggleNeighbor(cube, x + 1, y, z);
        toggleNeighbor(cube, x - 1, y, z);
        toggleNeighbor(cube, x, y + 1, z);
        toggleNeighbor(cube, x, y - 1, z);
        toggleNeighbor(cube, x, y, z + 1);
        toggleNeighbor(cube, x, y, z - 1);
    }

    private static void toggleNeighbor(int[][][] cube, int x, int y, int z) {
        if (x >= 0 && x <= 4 && y >= 0 && y <= 4 && z >= 0 && z <= 4) {
            cube[x][y][z] *= -1;
        }
    }
}
