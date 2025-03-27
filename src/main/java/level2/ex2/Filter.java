package level2.ex2;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static String filterStringsEvenerOdd(List<Integer> numbers) {

        return numbers.stream()
                .filter(number -> number % 2 == 0 || number % 2 == 1)
                .map(number -> number % 2 == 0 ? "e" + number : "o" + number)
                .collect(Collectors.joining(", "));

    }
}
