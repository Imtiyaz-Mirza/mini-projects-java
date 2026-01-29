import java.util.ArrayList;

public class miniprjday7 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        list.add("School level !");
        list.add("intermediate level !");
        list.add("Degree level ! ");
        list.add("Masters level !");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Position : " + (i + 1) + ". " + list.get(i));
        }
        list.remove(0);
        list.set(1, "Degree from OU !");
        System.out.println("The lists : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }
}
