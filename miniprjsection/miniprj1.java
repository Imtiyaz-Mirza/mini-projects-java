package miniprjsection;

public class miniprj1 {
    public static void main(String args[]) {
        int value = Integer.parseInt(args[0]);
        if (value >= 90) {
            System.out.println("Topper");
        } else if (value >= 70) {
            System.out.println("Above average !");

        } else if (value >= 40) {
            System.out.println("Passed !");
        } else if (value < 40) {
            System.out.println("Fail !");
        } else {
            System.out.println("Please Enter the valid value !!");
            System.out.println("Ex: 40, 50, 37,90.");
        }

    }
}