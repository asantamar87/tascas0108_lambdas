package level2.ex1;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    public static List<String> filterNamesWithThreeLetters(List<String> names) {
        return names.stream()
                .filter(name -> name.startsWith("A") && name.length() == 3)
                .collect(Collectors.toList());
    }

}
