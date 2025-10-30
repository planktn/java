import java.util.HashSet;
import java.util.Scanner;

public class Unique_Items {
    public static void main(String[] args) {

        String item;
        int quant = 0;
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        HashSet<String> grocery = new HashSet<>();
        grocery.add("Milk");
        grocery.add("Curd");
        grocery.add("Eggs");
        grocery.add("Bread");
        grocery.add("Apple");

        do {
            System.out.println("1. Show all items\n" +
                    "2. Add an item\n" +
                    "3. Remove an item\n" +
                    "4. Check if an item exists\n" +
                    "5. Count total unique items\n" +
                    "6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {

                case 1:
                    System.out.println(grocery);
                    break;


                case 6:
                    System.out.println("Exiting....");
                    run = false;
                    System.out.println("----------------------------");
                    break;

                default:
                    System.out.println("Wrong Choice");
                    System.out.println("----------------------------");
            }
        } while (run);
    }
}