//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in dollars: ");
        double amount = sc.nextDouble();
        int cents = (int) (amount * 100);
        int quarters = cents / 25;
        cents %= 25;
        int dimes = cents / 10;
        cents %= 10;
        int nickels = cents / 5;
        System.out.println(" Quarters: " + quarters);
        System.out.println(" Dimes: " + dimes);
        System.out.println(" Nickels: " + nickels);
        System.out.println("Thank You! Have a good day!");
    }
}