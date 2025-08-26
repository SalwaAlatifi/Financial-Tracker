import java.util.ArrayList;

public class Expense {

    String name;
    double amount;
    ArrayList<Expense> expenses = new ArrayList<>();

    Expense(){
    }

    Expense(String name, double amount){
         this.name = name;
         this.amount = amount;
    }

    public void addNewExpense(String name, double amount){
        expenses.add(new Expense(name, amount));
    }

    public void viewExpenses(){
        System.out.println("\n");
        for (Expense expense : expenses) {
            System.out.println(expense.name + " : " + expense.amount);
        }
        System.out.println("\n");
    }

    public void totalSpent(){
        double total = 0;
        for (Expense expense : expenses) {
            total += expense.amount;
        }
        System.out.println("\nTotal spent: " + total + "\n");   
    }
}