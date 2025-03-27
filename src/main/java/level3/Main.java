package level3;

import level3.management.StudentManager;
import level3.models.Student;

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


        StudentManager.printStudents("\nName and age of all students:", StudentManager.getNamesAndAges(students));
        StudentManager.printStudents("\nStudents whose name starts with 'A':", StudentManager.getStudentsWithNameStartingWithPrefix(students, "A"));
        StudentManager.printStudents("\nPassing students:", StudentManager.getPassingStudents(students));
        StudentManager.printStudents("\nNot PHP:", StudentManager.getNotPHPStudents(students));
        StudentManager.printStudents("\nMajor Java:", StudentManager.getMajorJavaStudents(students));


    }
}