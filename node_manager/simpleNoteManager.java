package node_manager;

import java.util.ArrayList;
import java.util.Scanner;

public class simpleNoteManager {
    static ArrayList<node> nodes = new ArrayList<>();
    static Scanner userInput = new Scanner(System.in);

    public static void main(String args[]) {
        int choice;
        do {
            System.out.println("\n 1. Add Notes ");
            System.out.println("\n 2. Show Notes");
            System.out.println("\n 3. Edit Notes");
            System.out.println("\n 4. Exit ");
            choice = userInput.nextInt();
            userInput.nextLine();
            switch (choice) {
                case 1:
                    addNote();
                    break;
                case 2:
                    showNotes();
                    break;
                case 3:
                    editNote();
                    break;
            }
        } while (choice != 4);
    }

    static void addNote() {
        System.out.print("Enter note : ");
        String text = userInput.nextLine();
        nodes.add(new node(text));
    }

    static void showNotes() {
        for (int i = 0; i < nodes.size(); i++) {
            System.out.println((i + 1) + ". " + nodes.get(i).getContent());
        }
    }

    static void editNote() {
        showNotes();
        System.out.print("Enter number to edit : ");
        int index = userInput.nextInt() - 1;
        userInput.nextLine();
        System.out.print("New note: ");
        String newText = userInput.nextLine();
        nodes.get(index).setContent(newText);
    }
}