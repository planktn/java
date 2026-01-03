import java.util.Scanner;

public class Console_Based_ATM_Simulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000.0;
        boolean run = true;

        while (run) {
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Amount: ");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Balance: " + balance);
                    } else {
                        System.out.println("Invalid amount");
                    }
                    break;

                case 3:
                    System.out.print("Amount: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Balance: " + balance);
                    } else {
                        System.out.println("Invalid transaction");
                    }
                    break;

                case 4:
                    System.out.println("Final Balance: " + balance);
                    run = false;
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
