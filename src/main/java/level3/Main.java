package level3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Alice", 20, "Java", 8.5),
                new Student("Bob", 19, "PHP", 4.5),
                new Student("Adam", 21, "Java", 7.0),
                new Student("Eve", 22, "Python", 6.0),
                new Student("Alex", 23, "Java", 9.0),
                new Student("John", 18, "PHP", 5.5),
                new Student("Anna", 25, "Java", 6.5),
                new Student("David", 17, "Java", 4.0),
                new Student("Andy", 22, "C#", 7.5),
                new Student("Sam", 24, "PHP", 3.0)
        );

        System.out.println("Name and age of each student:");
        students.forEach(s -> System.out.println(s.getName() + " " + s.getAge()));

        List<Student> studentsStartingWithA = students.stream()
                .filter(student -> student.getName().startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("\nStudents whose name starts with 'A':");
        studentsStartingWithA.forEach(student -> System.out.println(student.getName()));

        List <Student> passingStudents = students.stream()
                .filter(student -> student.getGrade() >= 5)
                .collect(Collectors.toList());
        System.out.println("\nPassing students:");
        passingStudents.forEach(student -> System.out.println(student.getName() + " " + student.getGrade()));


        List <Student> notPHP = students.stream()
                .filter(student -> student.getCourse() != "PHP")
                .collect(Collectors.toList());
        System.out.println("\nNot PHP:");
        notPHP.forEach(student -> System.out.println(student.getName() + " " + student.getCourse()));


        List <Student> majorJava = students.stream()
                .filter(student -> student.getCourse() == "Java" && student.getAge() > 18)
                .collect(Collectors.toList());
        System.out.println("\nMajor Java:");
        majorJava.forEach(student -> System.out.println(student.getName() + " " + student.getCourse()));
    }
}
