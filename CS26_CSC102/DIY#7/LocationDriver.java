import java.util.Scanner;

class Location {
    public int row;
    public int column;
    public double maxValue;

    // Constructor
    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    // Static method to locate the largest element in a 2D array
    public static Location locateLargest(double[][] array) {
        int maxRow = 0;
        int maxCol = 0;
        double max = array[0][0];

        // Traverse the 2D array to find the maximum value and its position
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        // Return a Location object with the max value and its indices
        return new Location(maxRow, maxCol, max);
    }

}

public class LocationDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }

        // Find the location of the largest element
        Location loc = Location.locateLargest(matrix);

        System.out.printf("The location of the largest element is %.1f at (%d, %d).",
                loc.maxValue, loc.row, loc.column);

        sc.close();
    }
}
