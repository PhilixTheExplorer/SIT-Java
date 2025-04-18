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

        int[] students = new int[6]; // index by year: 0,1 unused
        for (int i = 2; i <= 5; i++) {
            students[i] = sc.nextInt();
        }

        List<Battalion> battalions = List.of(
                new Battalion("Serpent Legion", List.of(2)),
                new Battalion("White Tiger Battalion", List.of(3)),
                new Battalion("Iron Bull Battalion", List.of(4, 5)),
                new Battalion("Shadow Leopard Battalion", List.of(2, 3)),
                new Battalion("Royal Lion Battalion", List.of(4, 5)),
                new Battalion("Eagle King Battalion", List.of(2, 3)));

        String lastBattalion = "";
        int lastDay = 0;

        int totalBatches = 30;

        for (int batch = 1; batch <= totalBatches; batch++) {

            for (Battalion battalion : battalions) {
                int year = battalion.years.size() == 1
                        ? battalion.years.get(0)
                        : battalion.years.get(batch % 2);

                if (students[year] == 0)
                    continue;

                int assignedCount = Math.min(660, students[year]);
                students[year] -= assignedCount;

                lastBattalion = battalion.name;
                lastDay = batch * 3;
                System.out.println("--INSIDE ASSIGN LOOP--: YEAR " + year + " assigned " + assignedCount);
                System.out.println(students[2] + " " + students[3] + " " + students[4] + " " + students[5]);
                System.out.println("--EACH BATTALION DONE--: " + battalion.name);

            }
            System.out.println("--AFTER EACH BATCH--: Batch " + batch);
            System.out.println(students[2] + " " + students[3] + " " + students[4] + " " + students[5]);
            System.out.println("------------------------");
            System.out.println();

            // If no students left at all, stop early
            if (students[2] + students[3] + students[4] + students[5] == 0) {
                break;
            }
        }

        if (students[2] + students[3] + students[4] + students[5] > 0) {
            System.out.println("Some students must wait until next year");
        } else {
            System.out.println("Day " + lastDay + " " + lastBattalion);
        }
    }
}
