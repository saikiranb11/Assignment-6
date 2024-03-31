import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();

        System.out.print("Enter the year of joining: ");
        int joiningYear = scanner.nextInt();

        int yearsOfService = currentYear - joiningYear;

        scanner.close();

        if (yearsOfService > 5) {
            System.out.println("Bonus awarded: Rs. 5000");
        } else if (yearsOfService >= 3) {
            System.out.println("Bonus awarded: Rs. 3000");
        } else {
            System.out.println("No bonus awarded");
        }
    }
}
