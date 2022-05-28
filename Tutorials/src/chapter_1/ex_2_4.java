package chapter_1;
import static utils.TextIO.*;

public class ex_2_4 {
    public static void main(String[] args) {
        int quarters, dimes, nickels, pennies;
        double dollars;
        // ask user to input each coin's value
        put("Enter the number of quarters: ");
        quarters = getlnInt();
        put("Enter the number of dimes: ");
        dimes = getlnInt();
        put("Enter the number of nickels: ");
        nickels = getlnInt();
        put("Enter the number of pennies: ");
        pennies = getlnInt();
        //convert each coin's value to dollars
        dollars = (quarters * 0.25) + (dimes * 0.10) + (nickels * 0.05) + (pennies * 0.01);
        // print the total amount of money
        put("The total amount of money is $" + dollars);

    }
}
