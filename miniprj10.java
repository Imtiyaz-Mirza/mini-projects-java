import java.util.ArrayList;
import java.util.Scanner;

public class miniprj10 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Learn java");
        list.add("practice java");
        list.add("Deploy java");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Tasks : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
        System.out.print("Enter task number to delete : ");
        int usernum = userInput.nextInt();
        userInput.nextLine();
        int index = usernum - 1;
        if (index >= 0 && index < list.size()) {
            list.remove(index);
            System.out.println("Task deleted !");
        } else {
            System.out.println("Invalid task number !");
        }
        System.out.println("Remaining tasks : " + list);
        userInput.close();
    }
}
