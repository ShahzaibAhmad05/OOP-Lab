import java.util.Scanner;

public class Invoice {
    private String itemNumber;
    private String description;
    private int quantity;
    private double pricePerItem;

    // Constructor to initialize invoice details
    public Invoice(String itemNumber, String description, int quantity, double pricePerItem) {
        this.itemNumber = itemNumber;
        this.description = description;
        this.quantity = (quantity > 0) ? quantity : 0;  // Ensuring that quantity is not negative
        this.pricePerItem = (pricePerItem > 0) ? pricePerItem : 0.0; // Ensuring that price is not negative
    }

    // Method to calculate the total invoice amount
    public double calculateInvoiceAmount() {
        return quantity * pricePerItem; // Total amount = quantity * price per item
    }

    // Method to display the invoice details
    public void showInvoiceDetails() {
        System.out.println("\n--- Invoice Details ---");
        System.out.println("Item Number: " + itemNumber);
        System.out.println("Description: " + description);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per Item: $" + pricePerItem);
        System.out.println("Total Amount: $" + calculateInvoiceAmount());
    }

    // Main method to process two items and display their invoices
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for first item details
        System.out.print("Enter item number: ");
        String firstItemNumber = input.nextLine();
        System.out.print("Enter item description: ");
        String firstItemDescription = input.nextLine();
        System.out.print("Enter quantity: ");
        int firstItemQuantity = input.nextInt();
        System.out.print("Enter price per item: ");
        double firstItemPrice = input.nextDouble();
        input.nextLine(); // Consume newline character after nextDouble()

        // Create the first invoice object
        Invoice invoice1 = new Invoice(firstItemNumber, firstItemDescription, firstItemQuantity, firstItemPrice);

        // Prompt user for second item details
        System.out.print("\nEnter item number: ");
        String secondItemNumber = input.nextLine();
        System.out.print("Enter item description: ");
        String secondItemDescription = input.nextLine();
        System.out.print("Enter quantity: ");
        int secondItemQuantity = input.nextInt();
        System.out.print("Enter price per item: ");
        double secondItemPrice = input.nextDouble();

        // Create the second invoice object
        Invoice invoice2 = new Invoice(secondItemNumber, secondItemDescription, secondItemQuantity, secondItemPrice);

        // Display the details of both invoices
        invoice1.showInvoiceDetails();
        invoice2.showInvoiceDetails();

        input.close(); // Close the scanner resource
    }
}
