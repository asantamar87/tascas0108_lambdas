package level1.ex7;

import java.util.Arrays;
import java.util.List;

import static level1.ex7.Filter.getShortestStringDescending;

public class Main {

    public static void main(String[] args) {

        List<Object> elements = Arrays.asList(3, "Hola", 1, "Java", "GPT", 42, "Programacio");


        List<String> orderedStrings2 = getShortestStringDescending(elements);

        System.out.println("Strings ordered by length ascending: " + orderedStrings2);

    }
}
