package CopilotStreamDemo;

import java.util.Comparator;
import java.util.List;

public class a01 {

    private record MarkGrade(int mark, String grade) {
    }

    public static void main(String[] args) {
        List<Integer> marks = List.of(39, 40, 89, 90, 100);

        List<MarkGrade> passingResults = marks.stream()
                .filter(mark -> mark >= 40)
                .map(mark -> new MarkGrade(mark, gradeFor(mark)))
                .sorted(Comparator.comparingInt(MarkGrade::mark))
                .toList();

        verifyBoundaryCases(passingResults);

        System.out.println("Passing marks and grades (sorted by mark):");
        passingResults.forEach(result ->
                System.out.println(result.mark() + " -> " + result.grade()));
    }

    private static String gradeFor(int mark) {
        if (mark >= 90) {
            return "A";
        }
        if (mark >= 80) {
            return "B";
        }
        if (mark >= 70) {
            return "C";
        }
        if (mark >= 60) {
            return "D";
        }
        return "E";
    }

    private static void verifyBoundaryCases(List<MarkGrade> results) {
        List<MarkGrade> expected = List.of(
                new MarkGrade(40, "E"),
                new MarkGrade(89, "B"),
                new MarkGrade(90, "A"),
                new MarkGrade(100, "A"));

        if (!results.equals(expected)) {
            throw new IllegalStateException(
                    "Boundary test failed. Expected " + expected + " but got " + results);
        }
    }
}
