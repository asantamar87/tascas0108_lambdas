package level3.management;

import level3.models.Student;

import java.util.List;
import java.util.stream.Collectors;

public class StudentManager {

    public static void printStudents(String message, List<String> students) {
        System.out.println(message);
        students.forEach(System.out::println);
    }


    public static List<String> getNamesAndAges(List<Student> students) {

        return students.stream()
                .map(s -> s.getName() + " " + s.getAge())
                .collect(Collectors.toList());
    }

    public static List<String> getStudentsWithNameStartingWithPrefix(List<Student> students, String prefix) {
        return students.stream()
                .filter(student -> student.getName().startsWith(prefix))
                .map(s -> s.getName() + " " + s.getAge())
                .collect(Collectors.toList());
    }

    public static List<String> getPassingStudents(List<Student> students) {
        return students.stream()
                .filter(student -> student.getGrade() >= 5)
                .map(s -> s.getName() + " " + s.getGrade())
                .collect(Collectors.toList());
    }

    public static List<String> getNotPHPStudents(List<Student> students) {
        return students.stream()
                .filter(student -> student.getGrade() >5 && !student.getCourse().equals("PHP"))
                .map(s -> s.getName() + " " + s.getCourse()+ " " + s.getGrade())
                .collect(Collectors.toList());

    }

    public static List<String> getMajorJavaStudents(List<Student> students) {
        return students.stream()
                .filter(student -> "Java".equals(student.getCourse()) && student.getAge() > 18)
                .map(s -> s.getName() + " " + s.getCourse())
                .collect(Collectors.toList());
    }

}
