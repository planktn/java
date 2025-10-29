import java.util.ArrayList;

public class snacks {
    public static void main(String[] args) {
        ArrayList<String> snacks = new ArrayList<>();

        // Adding snacks to the list
        snacks.add("Chips");
        snacks.add("Chocolate");
        snacks.add("Cookies");
        snacks.add("Fruit Snacks");
        snacks.add("Nuts");

        // Displaying the snacks
        System.out.println(snacks);

        snacks.set(2, "Granola Bars");
        snacks.remove("Nuts");
        System.out.println(snacks.size());

        for (String snack : snacks) {
            System.out.println(snack);

        }
    }
}
