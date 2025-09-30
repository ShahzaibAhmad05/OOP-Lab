// java program to calculate and print the earnings of an employee according to their sales
import java.util.Scanner;   // Scanner for taking input

public class EmployeeEarnings {
    public static void main(String[] args) {
        // create a scanner object
        Scanner scanner = new Scanner(System.in);
        // declare and assign the variables
        double[] itemValues = {239.99, 129.75, 99.95, 350.89};
        double valueOfSales = 0;
        int itemNumber, numberOfItems = itemValues.length;  // number of items will adjust automatically
        
        System.out.println("Enter the item number of the sold item (1-" + 
                numberOfItems + "), or enter -1 to finish: ");
        
        while (true) {
            itemNumber = scanner.nextInt();
            // break the loop and stop taking input if the user enters -1
            if (itemNumber == -1) break;
            
            if (itemNumber >= 1 && itemNumber <= numberOfItems) {
                valueOfSales += itemValues[itemNumber - 1];
            } else {
                System.out.println("Invalid item number, allowed values are (1-" +
                        numberOfItems + ")");
            }
        }
        // calculate and print the earnings with precision upto 2 decimals (1 cent)
        double earnings = 200 + (0.9 * valueOfSales);
        System.out.printf("%nTotal earnings: $%.2f%n", earnings);
        
        scanner.close();    // close the scanner
    }
}
