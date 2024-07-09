import java.util.Scanner;

public class CourseworkProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Displaying the menu
            System.out.println("Menu:");
            System.out.println("1. View coursework results");
            System.out.println("2. View exam results");
            System.out.println("3. Exit the program");

            System.out.println("Enter your choice (1-3):");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter number of units:");
                    int numUnits = scanner.nextInt();

                    // Arrays to store marks for each unit
                    int[] assignmentMarks = new int[numUnits];
                    int[] catMarks = new int[numUnits];

                    // Input marks for each unit
                    for (int i = 0; i < numUnits; i++) {
                        System.out.println("Enter marks for Unit " + (i + 1));
                        System.out.println("Assignment 1:");
                        int ass1 = scanner.nextInt();
                        System.out.println("Assignment 2:");
                        int ass2 = scanner.nextInt();
                        System.out.println("Assignment 3:");
                        int ass3 = scanner.nextInt();
                        System.out.println("CAT 1:");
                        int cat1 = scanner.nextInt();
                        System.out.println("CAT 2:");
                        int cat2 = scanner.nextInt();

                        // Check if any of the marks are 0
                        boolean hasZeroMark = (ass1 == 0 || ass2 == 0 || ass3 == 0 || cat1 == 0 || cat2 == 0);
                        if (hasZeroMark) {
                            System.out.println("Unit " + (i + 1) + " has one or more 0 marks.");
                        }

                        // Store marks in arrays if needed for further processing
                        assignmentMarks[i] = ass1 + ass2 + ass3;
                        catMarks[i] = cat1 + cat2;
                    }
                    break;
                case 2:
                    System.out.println("viewing exam results...");
                    // Implementation of viewing exam results can be added here
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                    break;
            }

        } while (choice != 3);

        scanner.close();
    }
}
