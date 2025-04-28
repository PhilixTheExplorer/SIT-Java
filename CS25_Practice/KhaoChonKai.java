import java.util.*;

public class KhaoChonKai {
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

        for (int batch = 1; batch <= totalBatches; batch++) {
            // If no students left at all, stop early
            if (students[2] + students[3] + students[4] + students[5] == 0) {
                break;
            }

            for (Battalion battalion : battalions) {
                // Skip battalions that can't take students
                if (battalion.years.size() == 1) {
                    int year = battalion.years.get(0);
                    if (students[year] == 0)
                        continue;
                } else {
                    // For battalions with multiple years
                    int year1 = battalion.years.get(0);
                    int year2 = battalion.years.get(1);
                    if (students[year1] == 0 && students[year2] == 0)
                        continue;
                }

                // Process students
                if (battalion.years.size() == 1) {
                    // Single year battalion
                    int year = battalion.years.get(0);
                    int assignedCount = Math.min(660, students[year]);
                    students[year] -= assignedCount;
                } else {
                    // Multi-year battalion, choose based on batch parity
                    int yearIndex = (batch % 2 == 1) ? 0 : 1;
                    int year = battalion.years.get(yearIndex);

                    // If the preferred year is empty, use the other one
                    if (students[year] == 0) {
                        year = battalion.years.get(1 - yearIndex);
                    }

                    int assignedCount = Math.min(660, students[year]);
                    students[year] -= assignedCount;
                }

                lastBattalion = battalion.name;
                lastBatch = batch;

                // Check if all years are empty after each battalion
                if (students[2] + students[3] + students[4] + students[5] == 0) {
                    break;
                }
            }
        }

        if (students[2] + students[3] + students[4] + students[5] > 0) {
            System.out.println("Some students must wait until next year.");
        } else {
            System.out.println("Latest Training Day: " + lastBatch * 3);
            System.out.println("Last Battalion: " + lastBattalion + " Battalion");
        }
    }

}
