package level2.ex4;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {



    public static void sortAlphabeticallyByFirstCharacter(List<String> list) {
        List<String> sortedList = list.stream()
                .sorted((s1, s2) -> Character.compare(s1.charAt(0), s2.charAt(0)))
                .collect(Collectors.toList());

        System.out.println("Sorted by first character: " + sortedList);
    }

    public static void sortWithEFirst(List<String> list) {
        List<String> sortedByE = list.stream()
                .sorted((s1, s2) -> Boolean.compare(!s1.contains("e"), !s2.contains("e")))
                .collect(Collectors.toList());

        System.out.println("Sorted with 'e' first: " + sortedByE);
    }

    public static void replaceAwith4(List<String> list) {
        List<String> replacedList = list.stream()
                .map(s -> s.replace("a", "4"))
                .collect(Collectors.toList());

        System.out.println("Replaced 'a' with '4': " + replacedList);
    }

    public static void filterNumericOnly(List<String> list) {
        List<String> numericOnly = list.stream()
                .filter(s -> s.matches("\\d+"))
                .collect(Collectors.toList());

        System.out.println("Numeric only: " + numericOnly);
    }
}
