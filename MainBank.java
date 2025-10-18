
import java.util.*;

public class MainBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<BankAccount> accounts = new ArrayList<>();

        int option;
        do {
            System.out.println("===== BankSystem 2.0 =====");
            System.out.println("1 - Create account");
            System.out.println("2 - Deposit");
            System.out.println("3 - Withdraw");
            System.out.println("4 - Show all accounts");
            System.out.println("0 - Exit");
            System.out.print("Option: ");
            option = sc.nextInt();
            sc.nextLine();

            switch(option) {
                case 1 -> {
                    System.out.print("Owner name: ");
                    String owner = sc.nextLine();
                    System.out.print("Initial balance: ");
                    double balance = sc.nextDouble();
                    sc.nextLine();
                    accounts.add(new BankAccount(owner, balance));
                }
                case 2 -> {
                    System.out.print("Owner name: ");
                    String owner = sc.nextLine();
                    BankAccount acc = find(accounts, owner);
                    if(acc != null) {
                        System.out.print("Amount: ");
                        double amt = sc.nextDouble(); sc.nextLine();
                        acc.deposit(amt);
                    }
                }
                case 3 -> {
                    System.out.print("Owner name: ");
                    String owner = sc.nextLine();
                    BankAccount acc = find(accounts, owner);
                    if(acc != null) {
                        System.out.print("Amount: ");
                        double amt = sc.nextDouble(); sc.nextLine();
                        acc.withdraw(amt);
                    }
                }
                case 4 -> accounts.forEach(BankAccount::showInfo);
            }
        } while(option != 0);
        sc.close();
    }

    private static BankAccount find(List<BankAccount> accounts, String name) {
        for(BankAccount a : accounts) if(a.getOwner().equalsIgnoreCase(name)) return a;
        System.out.println("Account not found.");
        return null;
    }
}
