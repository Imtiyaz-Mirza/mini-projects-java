package miniprjsection;

import java.util.Scanner;

public class miniprj2 {
    public static void main(String args[]) {
        try (Scanner scanin = new Scanner(System.in)) {
            boolean runn = true;
            while (runn) {
                System.out.println("\n ----- MENU -----");
                System.out.println("1.BURGER");
                System.out.println("2.PIZZA");
                System.out.println("3.TEA");
                System.out.println("4.EXIT");
                System.out.print("ENTER THE NUMBER : ");
                int userinput = scanin.nextInt();
                switch (userinput) {
                    case 1:
                        System.out.println("YOUR ORDER IS BURGER !");
                        break;
                    case 2:
                        System.out.println("YOUR ORDER IS PIZZA !");
                        break;
                    case 3:
                        System.out.println("YOUR ORDER IS TEA !");
                        break;
                    case 4:
                        System.out.println(" YOU CHOSE TO EXIT !");
                        runn = false;
                        break;
                    default:
                        System.out.println("please enter the valid input !");
                        System.out.println("EX: 1,2,3,4.");

                        break;

                }
            }
        }

    }
}