import java.util.Scanner;

public class CalculateTotalExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();

        scanner.close();

        double totalExpenses;
        if (quantity > 50) {
            totalExpenses = quantity * pricePerItem * 0.90; 
        } else if (quantity >= 25 && quantity <= 50) {
            totalExpenses = quantity * pricePerItem * 0.95; 
        } else {
            totalExpenses = quantity * pricePerItem; 
        }

        System.out.println("Total expenses: Rs. " + totalExpenses);
    }
}

