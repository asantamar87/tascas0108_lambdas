package level1.ex3;

import java.util.Arrays;
import java.util.List;

import static level1.ex3.Filter.printMonthNames;

public class Main {

    public static void main(String[] args) {

        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");
        System.out.println("Months: ");
        printMonthNames(months);

    }
}

