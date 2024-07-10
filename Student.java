public class Student {
    private String name;
    private int marks;
    private char grade;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
        this.grade = calculateGrade(marks);
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public char getGrade() {
        return grade;
    }

    public void setMarks(int marks) {
        this.marks = marks;
        this.grade = calculateGrade(marks);
    }

    private char calculateGrade(int marks) {
        if (marks >= 90) return 'A';
        else if (marks >= 80) return 'B';
        else if (marks >= 70) return 'C';
        else if (marks >= 60) return 'D';
        else return 'F';
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Marks: " + marks + ", Grade: " + grade;
    }
}
