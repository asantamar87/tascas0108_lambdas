package level1.ex2;

import java.util.Arrays;
import java.util.List;

import static level1.ex2.Filter.filterStringsWithOAndMoreThanFiveLetters;

public class Main {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", "World", "Java", "Programming", "OpenAI", "Lambda", "open", "developer");

        System.out.println("Strings that contain the letter 'o' and more than 5 letters: ");
        List<String> result2 = filterStringsWithOAndMoreThanFiveLetters(words);
        System.out.println("Strings that contain the letter 'o' and more than 5 letters: " + result2);
    }
}
