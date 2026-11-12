package day25;
import java.util.ArrayList;
import java.util.Scanner;
public class TodoManager {
    // Static Scanner and ArrayList
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> tasks = new ArrayList<>();

    // Keeps asking until the user enters a valid integer
    public static int getInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input. Please enter a number.");
            }
        }
    }

    // Displays the menu
    public static void showMenu() {
        System.out.println("\n===== TO-DO LIST MANAGER =====");
        System.out.println("1. Add a task");
        System.out.println("2. View all tasks");
        System.out.println("3. Update a task");
        System.out.println("4. Remove a task");
        System.out.println("5. Clear all tasks");
        System.out.println("0. Exit");
    }

    // Add a task
    public static void addTask() {
        System.out.print("Enter a task: ");
        String task = scanner.nextLine().trim();

        tasks.add(task);
        System.out.println("Task added successfully.");
    }

    // View all tasks
    public static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks yet.");
            return;
        }

        System.out.println("\nYour Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    // Update a task
    public static void updateTask() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks yet.");
            return;
        }

        viewTasks();

        int taskNumber = getInput("Enter task number to update: ");

        if (taskNumber < 1 || taskNumber > tasks.size()) {
            System.out.println("Invalid task number.");
            return;
        }

        System.out.print("Enter the new task: ");
        String newTask = scanner.nextLine().trim();

        tasks.set(taskNumber - 1, newTask);
        System.out.println("Task updated successfully.");
    }

    // Remove a task
    public static void removeTask() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks yet.");
            return;
        }

        viewTasks();

        int taskNumber = getInput("Enter task number to remove: ");

        if (taskNumber < 1 || taskNumber > tasks.size()) {
            System.out.println("Invalid task number.");
            return;
        }

        tasks.remove(taskNumber - 1);
        System.out.println("Task removed successfully.");
    }

    // Clear all tasks
    public static void clearTasks() {
        tasks.clear();
        System.out.println("All tasks have been cleared.");
    }

    // Main method
    public static void main(String[] args) {

        int choice;

        do {
            showMenu();
            choice = getInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    addTask();
                    break;

                case 2:
                    viewTasks();
                    break;

                case 3:
                    updateTask();
                    break;

                case 4:
                    removeTask();
                    break;

                case 5:
                    clearTasks();
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        scanner.close();
    }

}
