import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days the book is late: ");
        int daysLate = scanner.nextInt();

        scanner.close();

        double fine;
        if (daysLate <= 7) {
            fine = 0.50 * daysLate; 
        } else if (daysLate <= 14) {
            fine = 1.00 * (daysLate - 7) + 3.50; 
        } else if (daysLate <= 21) {
            fine = 5.00; 
        } else {
            System.out.println("Membership canceled. You are more than 21 days late.");
            return; 
        }

        System.out.println("Fine: Rs. " + fine);
    }
}
