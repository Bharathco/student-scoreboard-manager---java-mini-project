import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scoreboard scoreboard = new Scoreboard();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nScoreboard Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student Marks");
            System.out.println("3. Delete Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student marks: ");
                    int marks = scanner.nextInt();
                    scoreboard.addStudent(name, marks);
                    break;
                case 2:
                    System.out.print("Enter student name to update: ");
                    name = scanner.nextLine();
                    System.out.print("Enter new marks: ");
                    marks = scanner.nextInt();
                    scoreboard.updateStudent(name, marks);
                    break;
                case 3:
                    System.out.print("Enter student name to delete: ");
                    name = scanner.nextLine();
                    scoreboard.deleteStudent(name);
                    break;
                case 4:
                    scoreboard.displayStudents();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
