package level1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdasTest {
    public static List<String> filterStringsWithO(List<String> list) {

        return list.stream()
                .filter(s -> s.contains("o"))
                .collect(Collectors.toList());
    }

    public static List<String> filterStringsWithOAndMoreThanFiveLetters(List<String> words) {

        return words.stream()
                .filter(s -> s.contains("o") && s.length() > 5)
                .collect(Collectors.toList());

    }

    public static void printMonthNames(List<String> momnths) {
        momnths.forEach(System.out::println);
    }

    @FunctionalInterface
    interface GetPiValue {
        double getPiValue();
    }

    public static List<String> getShortestStringAscending(List<Object> elements) {

        return elements.stream()
                .filter(e -> e instanceof String)
                .map(e -> (String) e)
                .sorted((s1, s2) -> s1.length() - s2.length()) // Ordenació ascendent sense Comparator
                .collect(Collectors.toList());
    }

    public static List<String> getShortestStringDescending(List<Object> elements) {

        return elements.stream()
                .filter(e -> e instanceof String)
                .map(e -> (String) e)
                .sorted((s1, s2) -> s2.length() - s1.length()) // Ordenació descendent sense Comparator
                .collect(Collectors.toList());
    }

    @FunctionalInterface
    interface ReverseString {
        String reverse(String s);
    }

    public static void main(String[] args) {

        List<String> words = Arrays.asList("Hello", "World", "Java", "Programming", "OpenAI", "Lambda", "open", "developer");

        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");

        System.out.println("Strings that contain the letter 'o': ");
        List<String> result = filterStringsWithO(words);
        System.out.println("Strings that contain the letter 'o': " + result);

        //Ex 2

        System.out.println("Strings that contain the letter 'o' and more than 5 letters: ");
        List<String> result2 = filterStringsWithOAndMoreThanFiveLetters(words);
        System.out.println("Strings that contain the letter 'o' and more than 5 letters: " + result2);

        //Ex 3
        System.out.println("Months: ");
        printMonthNames(months);


        //Ex 5
        System.out.println("The value of pi is: ");
        GetPiValue getPiValue = () -> 3.1415;
        System.out.println("The value of pi is: " + getPiValue.getPiValue());


        List<Object> elements = Arrays.asList(3, "Hola", 1, "Java", "GPT", 42, "Programacio");

        List<String> orderedStrings = getShortestStringAscending(elements);

        System.out.println("Strings ordered by length descending: " + orderedStrings);

        List<String> orderedStrings2 = getShortestStringDescending(elements);

        System.out.println("Strings ordered by length ascending: " + orderedStrings2);


        String originalString = "Hello";
        ReverseString reverseString = s -> new StringBuilder(s).reverse().toString();
        String reversedString = reverseString.reverse(originalString);
        System.out.println("Reversed string: " + reversedString);


    }
}
