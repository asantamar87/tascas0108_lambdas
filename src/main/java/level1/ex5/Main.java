package level1.ex5;


public class Main {
    public static void main(String[] args) {

        GetPiValue value = () -> 3.1415;
        System.out.println("The value of pi is: " + value.getPiValue());

    }
}


