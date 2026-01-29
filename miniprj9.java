import java.util.ArrayList;
import java.util.Scanner;

public class miniprj9 {
    static ArrayList<String> list = new ArrayList<>();

    static void addTask(Scanner userInput) {
        System.out.print("Enter task name : ");
        String task = userInput.nextLine();
        list.add(task);
        System.out.println("Your task has been added successfully !");
    }

    static void showTask() {
        if (list.isEmpty()) {
            System.out.println("There is nothing here...!");
            return;
        }
        System.out.println("Your Tasks : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));

        }
        System.out.println("Total Tasks : " + list.size());
    }

    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);
        while (true) {
            System.out.println("\n ----Task Menu----");
            System.out.println("1. Add task ");
            System.out.println("2. Show task ");
            System.out.println("3. Exit task ");
            System.out.print("Enter value : ");
            int value = userInput.nextInt();
            userInput.nextLine();
            switch (value) {
                case 1:
                    addTask(userInput);
                    break;
                case 2:
                    showTask();
                    break;
                case 3:
                    System.out.println("Thanks for using our service !");
                    return;

                default:
                    System.out.println("please Enter valid inputl !");
                    System.out.println("Ex : 1, 2 or 3");
                    break;

            }

        }

    }
}
