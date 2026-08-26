import java.util.Scanner;
import java.util.ArrayList;
public class ToDoList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the To do list! ");

        ArrayList<String> todoList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter you task: ");
            String answer = scanner.nextLine();
            todoList.add(answer);
        }



        for (int i = 0; i < todoList.size(); i++ ) {
            System.out.println((i + 1) + "." + todoList.get(i));
        }



        scanner.close();

    }

}
