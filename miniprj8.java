import java.util.ArrayList;
import java.util.Scanner;

public class miniprj8 {
    static ArrayList<String> list = new ArrayList<>();

    static void addTask(String taskName) {
        list.add(taskName);
        System.out.println("Task Added : " + taskName);
    }

    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter 3 Tasks : ");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Task" + i + ": ");
            String input = userInput.nextLine();
            addTask(input);
        }
        System.out.println("\n Your Tasks : ");
        System.out.println(list);
        userInput.close();
    }
}