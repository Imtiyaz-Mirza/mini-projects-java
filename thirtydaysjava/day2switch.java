public class day2switch {
   public static void main(String args[]) {
      int a = Integer.parseInt(args[0]);
      switch (a) {
         case 1:
            System.out.println("Monday");
            break;
         case 2:
            System.out.println("Tusday");
            break;
         default:
            System.out.println("There is no valid value intered !");
            break;
      }
   }
}