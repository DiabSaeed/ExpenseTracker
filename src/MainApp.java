import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        String choice = "Go";
        while (choice.strip().toLowerCase() != "exit") {
            System.out.println("""
                ========== EXPENSE TRACKER ==========

                1. Add Expense
                2. View All Expenses
                3. Calculate Total Expenses
                4. Show Remaining Budget
                5. Find Highest Expense
                6. Exit
                """);
            Scanner choose = new Scanner(System.in);
            System.out.println("Enter Your Choice");

            choice = choose.nextLine();
        }
    }
}
