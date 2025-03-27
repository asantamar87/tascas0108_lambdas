package level1.ex4;

import java.util.List;

public class Filter {
    public static void printMonthNamesmethodReference(List<String> months) {
        months.forEach(System.out::println);
    }
}
