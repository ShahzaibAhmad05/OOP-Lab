import java.util.Scanner;

public class SalesDept {
    
    // calculate total sales using variable-length arguments
    public static void generateReport(String month, double... sales) {
        double totalSales = 0;

        // Display sales entries
        System.out.println("\n==== " + month + " Sales Report ====");
        int counter = 0;
        for (double sale : sales) {
            System.out.printf("Sale %d: $%.2f%n", counter, sale);
            totalSales += sale;
            counter++;
        }
        // Display total sales
        System.out.printf("Total Sales: $%.2f%n", totalSales);
        System.out.println("====================================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // for taking inputs
        // Get the month name
        System.out.print("Enter the month: ");
        String month = scanner.nextLine();
        // Get the number of sales
        System.out.print("Enter the number of sales: ");
        int numSales = scanner.nextInt();
        double[] sales = new double[numSales];

        // Get sales amounts
        for (int i = 0; i < numSales; i++) {
            System.out.print("Entry " + (i + 1) + ": ");
            sales[i] = scanner.nextDouble();
        }
        // convert ArrayList to array and generate report
        generateReport(month, sales);
        scanner.close();    // close the scanner
    }
}
