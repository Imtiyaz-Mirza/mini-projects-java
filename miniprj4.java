import java.util.Scanner;

public class miniprj4 {
    public static void main(String args[]) {
        try (Scanner inp = new Scanner(System.in)) {
            boolean runn = true;
            System.out.print("Enter your Name : ");
            String name = inp.nextLine();

            System.out.print("Enter you Age :  ");
            int age = inp.nextInt();
            System.out.println("\n -----User Details-----");
            System.out.println(name);
            System.out.println(age);

            while (runn) {
                System.out.println("-----MENU-----");
                String[] menu_input = { "1.Dal", "2.Rice", "3.Chapati", "4.Chicken" };
                for (int i = 0; i < menu_input.length; i++) {
                    System.out.println(menu_input[i]);
                }
                System.out.println("Please enter the valid num !");
                int user_inp = inp.nextInt();
                switch (user_inp) {
                    case 1:
                        System.out.println("Your order as DAL has been placed !");
                        break;
                    case 2:
                        System.out.println("Your order as RICE has been placed !");
                        break;
                    case 3:
                        System.out.println("Your order as CHAPATI has been placed !");
                        break;
                    case 4:
                        System.out.println("Your order as CHICKEN has been placed !");
                        runn = false;
                        break;

                    default:
                        System.out.println("Error : Please enter the valid number !");
                        System.out.println("Ex : 1, 2, 3, 4");
                        break;

                }

            }
        }
    }
}