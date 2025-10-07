import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // array to store unique numbers
        final int numberCount = 5;
        int[] uniqueNumbers = new int[numberCount];
        int count = 0; // counter for unique numbers

        while (count < numberCount) {
            System.out.print("Enter a number (10-100): ");
            int number = scanner.nextInt();

            // check if the number is within the valid range
            if (number < 10 || number > 100) {
                System.out.println("Number out of range (10-100).");
                continue; // continue to the next iteration
            }
            // check for duplicate numbers
            boolean isDuplicate = false;
            for (int i = 0; i < count; i++) {
                if (uniqueNumbers[i] == number) {
                    isDuplicate = true;
                    break;
                }
            }
            // If the number is unique, add it to the array
            if (!isDuplicate) {
                uniqueNumbers[count] = number;
                count++;

                // display current unique numbers
                System.out.print("Unique numbers collected: [");
                for (int i = 0; i < count; i++) {
                    String temp = i < count - 1 ? ", ": "";
                    System.out.print(uniqueNumbers[i] + temp);
                }
                System.out.print("]\n");
            } else {
                System.out.println("Duplicate number found.");
            }
        }
        scanner.close();    // close the scanner
    }
}
