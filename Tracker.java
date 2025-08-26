import java.util.Scanner;

public class Tracker {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        Expense e = new Expense();
        Income i = new Income();

        System.out.println("Welcome to the finance tracker!");

        while(true){
            System.out.println("Enter the menu number please:" +
            "\n1. Expense menu\n2. Income menu\n3. Exit");

            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1){
                // Expense menu loop
                while (true) {
                    System.out.println("Expense Menu - Enter the choice number please: " +
                    "\n1. Add an expense\n2. View all expenses\n3. View the total spent" + 
                    "\n4. Return to the main menu");

                    int expenseChoice = input.nextInt();
                    input.nextLine();

                    switch (expenseChoice) {
                        case 1:
                            System.out.println("Enter the expense name:");
                            String name = input.nextLine();
                            System.out.println("Enter the expense amount:");
                            double amount = input.nextDouble();
                            input.nextLine();
                            e.addNewExpense(name, amount);
                            break;
                        case 2:
                            e.viewExpenses();
                            break;
                        case 3:
                            e.totalSpent();
                            break;
                        case 4:
                            // break out of Expense menu loop → back to main menu
                            break;
                        default:
                            System.out.println("Invalid input");
                            break;
                    }
                    if (expenseChoice == 4) {
                        break; // exit Expense menu loop
                    }
                }
            }
            else if (choice == 2){
                // Income menu loop
                while (true) {
                    System.out.println("Income Menu - Enter the choice number please: " +
                    "\n1. Add an income\n2. View all incomes\n3. View the total income" + 
                    "\n4. Return to the main menu");

                    int incomeChoice = input.nextInt();
                    input.nextLine();

                    switch (incomeChoice) {
                        case 1:
                            System.out.println("Enter the income name:");
                            String name = input.nextLine();
                            System.out.println("Enter the income amount:");
                            double amount = input.nextDouble();
                            input.nextLine();
                            i.addNewIncome(name, amount);
                            break;
                        case 2:
                            i.viewIncomes();
                            break;
                        case 3:
                            i.totalIncome();
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Invalid input");
                            break;
                    }
                    if (incomeChoice == 4) {
                        break; 
                    }
                }
            }
            else if (choice == 3){
                System.out.println("Goodbye!");
                input.close();
                System.exit(choice);
            }
            else {
                System.out.println("Invalid input, try again");
            }
        }
    }
}