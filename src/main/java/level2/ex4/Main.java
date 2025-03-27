package level2.ex4;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> mixedList = List.of("apple", "42", "banana", "35", "grape", "18");

        Filter.sortAlphabeticallyByFirstCharacter(mixedList);
        Filter.sortWithEFirst(mixedList);
        Filter.replaceAwith4(mixedList);
        Filter.filterNumericOnly(mixedList);

    }
}
