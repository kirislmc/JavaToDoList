import java.util.Scanner;

public class ToDoList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the To do list! ");

        System.out.println("Enter you task: ");
        String task1 = scanner.nextLine();

        System.out.println("Enter you task: ");
        String task2 = scanner.nextLine();

        System.out.println("Enter you task: ");
        String task3 = scanner.nextLine();

        System.out.println("Enter you task: ");
        String task4 = scanner.nextLine();

        System.out.println("Enter you task: ");
        String task5 = scanner.nextLine();

        System.out.println("Your to do list is: ");
        System.out.println("1." + task1);
        System.out.println("2." + task2);
        System.out.println("3." + task3);
        System.out.println("4." + task4);
        System.out.println("5." + task5);

        scanner.close();

    }
}
