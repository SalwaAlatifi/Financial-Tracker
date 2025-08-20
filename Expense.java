import java.util.ArrayList;

public class Expense {

    String name;
    double amount;
    ArrayList<Expense> expenses = new ArrayList<>();

    private Expense(String name, double amount){
        this.name = name;
        this.amount = amount;
    }

    public void addNewExpense(String name, double amount){
        expenses.add(new Expense(name, amount));

    }

    public void viewExpenses(){

    }

    public void totalSpent(){
        
    }
}