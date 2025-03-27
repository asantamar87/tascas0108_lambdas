package level1.ex4;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");
        System.out.println("Months: ");
        Filter.printMonthNamesmethodReference(months);
    }

}
