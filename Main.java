import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Simulasi Student
        Student s = new Student("Budi", "Jakarta");
        s.addCourseGrade("Matematika", 85);
        s.addCourseGrade("Fisika", 90);
        s.printGrades();
        System.out.println("Rata-rata: " + s.getAverageGrade());
        System.out.println(s);

        // Simulasi Teacher
        Teacher t = new Teacher("Ibu Ani", "Bandung");
        t.addCourse("Matematika");
        t.addCourse("Fisika");
        t.removeCourse("Kimia"); // false
        t.removeCourse("Fisika"); // true
        System.out.println(t);
    }
}
