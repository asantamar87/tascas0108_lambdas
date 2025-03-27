package level1.ex8;


public class Main {
    public static void main(String[] args) {
        ReverseString reverseString = s -> new StringBuilder(s).reverse().toString();
        System.out.println(reverseString.reverse("Hello"));

    }
}
