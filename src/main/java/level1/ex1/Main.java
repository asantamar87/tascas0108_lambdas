package level1.ex1;

import java.util.Arrays;
import java.util.List;

import static level1.ex1.Filter.filterStringsWithO;

public class Main {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", "World", "Java", "Programming", "OpenAI", "Lambda", "open", "developer");

        System.out.println("Strings that contain the letter 'o': ");
        List<String> result = filterStringsWithO(words);
        System.out.println("Strings that contain the letter 'o': " + result);

    }
}
