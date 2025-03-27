package level2.ex3;

public class Main {

    public static void main(String[] args) {

        performOperations();
    }
    public static void performOperations() {
        Operation sum = () -> 5 + 3;
        Operation subtract = () -> 5 - 3;
        Operation multiply = () -> 5 * 3;
        Operation divide = () -> 5 / 3f;

        System.out.println("Sum: " + sum.operation());
        System.out.println("Subtract: " + subtract.operation());
        System.out.println("Multiply: " + multiply.operation());
        System.out.println("Divide: " + divide.operation());
    }

}
