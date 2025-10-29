import java.util.ArrayList;
import java.util.Scanner;
public class Mini_Grocery
{
    public static void main(String[] args)
    {
        String item;
        boolean run= true;
        Scanner sc=new Scanner(System.in);
        ArrayList<String> groceries = new ArrayList<>();

        groceries.add("Milk");
        groceries.add("Bread");
        groceries.add("Tomato");
        groceries.add("Sugar");
        groceries.add("Salt");
        do
        {
        System.out.println("1. Show all items\n" +
                "2. Add an item\n" +
                "3. Remove an item\n" +
                "4. Update an item\n" +
                "5. Count total items\n" +
                "6. Exit");


            System.out.print("Enter your choice: ");
            int choice=sc.nextInt();
            sc.nextLine();
            switch (choice)
            {
                case 1:
                    System.out.println("Your groceries: "+ groceries);
                    break;

                case 2:
                    System.out.print("Enter item to add: ");
                    item=sc.nextLine();
                    groceries.add(item);
                    System.out.println(item +" added");
                    break;

                case 3:
                    System.out.print("Enter item to remove: ");
                    item=sc.nextLine();
                    groceries.remove(item);
                    System.out.println(item +" removed");
                    break;

                case 4:
                    System.out.println("Enter the index number and new item");
                    System.out.print("Index No: ");
                    int i=sc.nextInt();
                    sc.nextLine();
                    System.out.print("New Item Name: ");
                    item=sc.nextLine();
                    if (i >= 0 && i < groceries.size()) {
                        groceries.set(i, item);
                        System.out.println("List Updated");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 5:
                    System.out.println("You have " + groceries.size() + " items in your grocery list.");
                    break;

                case 6:
                    System.out.println("Exit");
                    run = false;
                    break;

                default:
                    System.out.println("Wrong Choice");
            }
        }while(run);

    }
}
