import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter information of student "+ (i + 1) +" (maximum is 10): ");
            System.out.println("Name of the student: ");
            String name = sc.nextLine();
            System.out.println("Grade of the student (0 - 10): ");
            double grade = sc.nextDouble();
            sc.nextLine();

            if (grade < 0 || grade > 10) {
                System.out.println("Invalid grade!");
                return;
            }

            Student student = new Student(name, grade);
            students.add(student);
        }

        System.out.println("\nStudent with grade > 8");
        for (Student student : students) {
            if (student.getGrade() >= 8) {
                System.out.println(student.displayInfo());
            }
        }

        int weak = 0;
        int average = 0;
        int good = 0;

        for (Student student : students) {
            if (student.getGrade() > 7) {
                good++;
            } else if (student.getGrade() >= 5 && student.getGrade() <= 7) {
                average++;
            } else {
                weak++;
            }
        }
        System.out.println("\nStudent with good: " + good );
        System.out.println("Student with average: " + average);
        System.out.println("Student with weak: " + weak);

        sc.close();
    }
}