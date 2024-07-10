import java.util.ArrayList;
import java.util.List;

public class Scoreboard {
    private List<Student> students;

    public Scoreboard() {
        students = new ArrayList<>();
    }

    public void addStudent(String name, int marks) {
        students.add(new Student(name, marks));
    }

    public void updateStudent(String name, int newMarks) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                student.setMarks(newMarks);
                break;
            }
        }
    }

    public void deleteStudent(String name) {
        students.removeIf(student -> student.getName().equals(name));
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
