import java.util.Scanner;

public class NumberStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (type 'done' to finish):");

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        while (true) {
            String input = scanner.next();

            if (input.equals("done")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);

                largest = Math.max(largest, number);
                smallest = Math.min(smallest, number);

                sum += number;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'done' to finish.");
            }
        }

        scanner.close();

        double average = (double) sum / count;

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
        System.out.println("Average: " + average);
    }
}

