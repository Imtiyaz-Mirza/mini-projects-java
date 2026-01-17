import java.util.Scanner;

public class scanneruse {
    public static void main(String args[]) {
        try (Scanner scaninput = new Scanner(System.in)) {
            System.out.print("Enter Your Age : ");
            int userage = scaninput.nextInt();
            System.out.print("Enter your Name : ");
            String username = scaninput.next();
            System.out.println("Your name is : " + username);
            System.out.println("Your age is : " + userage);

        }
    }
}