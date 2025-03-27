package level1.ex1;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    public static List<String> filterStringsWithO(List<String> list) {

        return list.stream()
                .filter(s -> s.toLowerCase().contains("o"))
                .collect(Collectors.toList());
    }
}
