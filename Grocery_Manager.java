import java.util.HashMap;
import java.util.Scanner;

public class Grocery_Manager {
    public static void main(String[] args) {

        String item;
        int quant=0;
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> groceries = new HashMap<>();
        groceries.put("Milk", 1);
        groceries.put("Curd", 1);
        groceries.put("Eggs", 12);
        groceries.put("Bread", 1);
        groceries.put("Apple", 6);

        do {
            System.out.println("1. Show all items\n" +
                    "2. Add or Update an item\n" +
                    "3. Remove an item\n" +
                    "4. Get quantity of an item\n" +
                    "5. Count total items\n" +
                    "6. Exit");

            System.out.print("Enter your choice: ");
            int choice=sc.nextInt();
            sc.nextLine();
            switch (choice) {

                case 1:
                    System.out.println("Your groceries: "+ groceries);
                    System.out.println("----------------------------");
                    break;

                case 2:
                    System.out.print("Enter item name: ");
                    item = sc.nextLine();
                    System.out.print("Enter quantity: ");
                    quant = sc.nextInt();
                    sc.nextLine();
                    if (groceries.containsKey(item)) {
                        groceries.put(item, quant);
                        System.out.println(item + " updated!");
                    } else {
                        groceries.put(item, quant);
                        System.out.println(item + " added!");
                    }
                    System.out.println("----------------------------");
                    break;

                case 3:
                    System.out.print("Enter the name to be removed: ");
                    item = sc.nextLine();
                    if (groceries.containsKey(item)) {
                        groceries.remove(item);
                        System.out.println(item + " removed.");
                    } else {
                        System.out.println(item + " not found.");
                    }
                    System.out.println("----------------------------");
                    break;

                case 4:
                    System.out.print("Enter the item name: ");
                    item = sc.nextLine();
                    if (groceries.containsKey(item)) {
                        System.out.println("You have " + groceries.get(item) + " " + item + ".");
                    } else {
                        System.out.println(item + " not found in your list.");
                    }
                    System.out.println("----------------------------");
                    break;

                case 5:
                    System.out.println(groceries.size());
                    System.out.println("----------------------------");
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

        }while(run);
    }
}
