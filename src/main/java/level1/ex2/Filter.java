package level1.ex2;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    public static List<String> filterStringsWithOAndMoreThanFiveLetters(List<String> words) {

        return words.stream()
                .filter(s -> s.toLowerCase().contains("o") && s.length() > 5)
                .collect(Collectors.toList());

    }
}
