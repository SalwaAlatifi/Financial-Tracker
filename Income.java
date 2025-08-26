import java.util.ArrayList;
public class Income {
    String name;
    double amount;
    ArrayList<Income> incomes = new ArrayList<>();

    Income(){}

    private Income(String name, double amount){
        this.name = name;
        this.amount = amount;
    }

    public void addNewIncome(String name, double amount){
        incomes.add(new Income(name, amount));
    }

    public void viewIncomes(){
        System.out.println("\n");
        for (Income income : incomes) {
            System.out.println(income.name + " : " + income.amount);
        }
        System.out.println("\n");
    }

    public void totalIncome(){
        double total = 0;
        for (Income income : incomes) {
            total += income.amount;
        }
        System.out.println("\nTotal income: " + total + "\n");   
    }
}