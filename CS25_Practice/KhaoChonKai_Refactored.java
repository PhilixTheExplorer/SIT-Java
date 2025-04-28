import java.util.*;

public class KhaoChonKai_Refactored {
    static class Battalion {
        String name;
        List<Integer> years;

        Battalion(String name, List<Integer> years) {
            this.name = name;
            this.years = years;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] students = new int[6]; // index by year: 0 unused
        for (int i = 2; i <= 5; i++) {
            students[i] = sc.nextInt();
        }

        List<Battalion> battalions = List.of(
                new Battalion("Serpent Legion", List.of(2)),
                new Battalion("White Tiger", List.of(3)),
                new Battalion("Iron Bull", List.of(4, 5)),
                new Battalion("Shadow Leopard", List.of(2, 3)),
                new Battalion("Royal Lion", List.of(4, 5)),
                new Battalion("Eagle King", List.of(2, 3)));

        String lastBattalion = "";
        int lastBatch = 1;
        int totalBatches = 30;

        trainingLoop: for (int batch = 1; batch <= totalBatches; batch++) {
            // If no students left at all, stop early
            if (areAllYearsEmpty(students)) {
                break;
            }

            for (Battalion battalion : battalions) {
                // Skip if battalion can't accept students
                if (!canAcceptStudents(battalion, students)) {
                    continue;
                }

                // Assign students to battalion
                assignStudents(battalion, students, batch);

                lastBattalion = battalion.name;
                lastBatch = batch;

                // Check if all years are empty after each battalion
                if (areAllYearsEmpty(students)) {
                    break trainingLoop;
                }
            }
        }

        if (!areAllYearsEmpty(students)) {
            System.out.println("Some students must wait until next year.");
        } else {
            System.out.println("Latest Training Day: " + lastBatch * 3);
            System.out.println("Last Battalion: " + lastBattalion + " Battalion");
        }
    }

    private static boolean canAcceptStudents(Battalion battalion, int[] students) {
        if (battalion.years.size() == 1) {
            int year = battalion.years.get(0);
            return students[year] > 0;
        } else {
            int year1 = battalion.years.get(0);
            int year2 = battalion.years.get(1);
            return students[year1] > 0 || students[year2] > 0;
        }
    }

    private static void assignStudents(Battalion battalion, int[] students, int batch) {
        if (battalion.years.size() == 1) {
            // Single year battalion
            int year = battalion.years.get(0);
            int assignedCount = Math.min(660, students[year]);
            students[year] -= assignedCount;
        } else {
            // Multi-year battalion, choose based on batch parity
            int yearIndex = (batch % 2 == 1) ? 0 : 1;
            int preferredYear = battalion.years.get(yearIndex);

            // If the preferred year is empty, use the other one
            if (students[preferredYear] == 0) {
                preferredYear = battalion.years.get(1 - yearIndex);
            }

            int assignedCount = Math.min(660, students[preferredYear]);
            students[preferredYear] -= assignedCount;
        }
    }

    private static boolean areAllYearsEmpty(int[] students) {
        for (int year = 2; year <= 5; year++) {
            if (students[year] > 0) {
                return false;
            }
        }
        return true;
    }
}
