import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FacultyManagementSystem {
    private static ArrayList<Faculty> facultyList = new ArrayList<>();
    private static int facultyIdCounter = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Faculty");
            System.out.println("2. Display Faculty");
            System.out.println("3. Update Faculty");
            System.out.println("4. Delete Faculty");
            System.out.println("5. Search Faculty");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addFaculty(scanner);
                    break;
                case 2:
                    displayFaculty();
                    break;
                case 3:
                    updateFaculty(scanner);
                    break;
                case 4:
                    deleteFaculty(scanner);
                    break;
                case 5:
                    searchFaculty(scanner);
                    break;
                case 6:
                    System.out.println("Exiting Faculty Management System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
