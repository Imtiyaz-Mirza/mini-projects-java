public class elseifd2 {
    public static void main(String args[]) {
        int num = Integer.parseInt(args[0]);
        if (num >= 90) {
            System.out.println("Topper !");
        } else if (num >= 80) {
            System.out.println("Medium !");
        } else if (num >= 65) {
            System.out.println("Average student  !");

        } else {
            System.out.println("Fail !!");
        }
    }
}
