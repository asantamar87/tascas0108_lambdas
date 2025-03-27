package level1.ex6;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    public static List<String> getShortestStringAscending(List<Object> elements) {

        return elements.stream()
                .filter(e -> e instanceof String)
                .map(e -> (String) e)
                .sorted((s1, s2) -> s1.length() - s2.length()) // Ordenació ascendent sense Comparator
                .collect(Collectors.toList());
    }
}
