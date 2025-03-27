package level1.ex7;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    public static List<String> getShortestStringDescending(List<Object> elements) {

        return elements.stream()
                .filter(e -> e instanceof String)
                .map(e -> (String) e)
                .sorted((s1, s2) -> s2.length() - s1.length()) // Ordenació descendent sense Comparator
                .collect(Collectors.toList());
    }




}
