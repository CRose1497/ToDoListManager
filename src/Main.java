import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of users: ");
        int userCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < userCount; i++) {
            System.out.print("Enter name for user " + (i + 1) + ": ");
            String name = scanner.nextLine();
            users.add(new User(name));
        }

        boolean running = true;
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Completed");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    User user1 = pickUser(users, scanner);
                    System.out.print("Enter task description: ");
                    String taskDesc = scanner.nextLine();
                    user1.getToDoList().addTask(taskDesc);
                    break;

                case 2:
                    User user2 = pickUser(users, scanner);
                    user2.getToDoList().printTasks();
                    System.out.print("Enter index of task to mark completed: ");
                    int index = Integer.parseInt(scanner.nextLine());
                    user2.getToDoList().markTaskCompleted(index);
                    break;

                case 3:
                    for (User user : users) {
                        System.out.println("\nTasks for " + user.getName() + ":");
                        user.getToDoList().printTasks();
                    }
                    break;

                case 4:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }

    private static User pickUser(ArrayList<User> users, Scanner scanner) {
        System.out.println("Select user:");
        for (int i = 0; i < users.size(); i++) {
            System.out.println(i + ". " + users.get(i).getName());
        }
        int choice = Integer.parseInt(scanner.nextLine());
        return users.get(choice);
    }
}
