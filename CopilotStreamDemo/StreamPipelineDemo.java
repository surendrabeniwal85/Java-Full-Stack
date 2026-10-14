package CopilotStreamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPipelineDemo {

    public static void main(String[] args) {
        List<Integer> salaries = Arrays.asList(30000, 60000, 45000, 80000, 55000);

        List<Integer> updatedSalaries = salaries.stream()
                .filter(salary -> salary > 50000) // Keep only salaries greater than 50,000.
                .map(salary -> salary + salary / 10) // Increase each remaining salary by 10%.
                .sorted() // Arrange the updated salaries in ascending order.
                .collect(Collectors.toList()); // Collect the stream results into a list.

        System.out.println(updatedSalaries);
    }
}
