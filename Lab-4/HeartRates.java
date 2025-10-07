import java.util.Scanner;

public class HeartRates{
    private String firstName;
    private String lastName;
    private int birthMonth;
    private int birthDay;
    private int birthYear;

    // Constructor to initialize the person's details
    public HeartRates(String firstName, String lastName, int birthMonth, int birthDay, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
    }

    // Method to compute the person's age based on their birth year
    public int getAge() {
        int currentYear = 2025; // Set current year as 2025 manually
        return currentYear - birthYear; // Return calculated age
    }

    // Method to calculate the maximum heart rate
    public int getMaxHeartRate() {
        return 220 - getAge(); // Maximum heart rate formula
    }

    // Method to calculate the target heart rate range (50% - 85% of max HR)
    public String getTargetHeartRateRange() {
        int maxHeartRate = getMaxHeartRate();
        double lowerBound = maxHeartRate * 0.50; // Lower bound of the target range
        double upperBound = maxHeartRate * 0.85; // Upper bound of the target range
        return String.format("%.2f - %.2f bpm", lowerBound, upperBound); // Return formatted range
    }

    // Method to display the person's details and heart rate information
    public void displayInfo() {
        System.out.println("\n--- Heart Rate Information ---");
        System.out.println("Full Name: " + firstName + " " + lastName);
        System.out.println("Date of Birth: " + birthMonth + "/" + birthDay + "/" + birthYear);
        System.out.println("Age: " + getAge() + " years");
        System.out.println("Maximum Heart Rate: " + getMaxHeartRate() + " bpm");
        System.out.println("Target Heart Rate Range: " + getTargetHeartRateRange());
    }

    // Main method to interact with the user and display results
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompting user for personal details
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter last name: ");
        String lastName = input.nextLine();
        System.out.print("Enter birth month (1-12): ");
        int birthMonth = input.nextInt();
        System.out.print("Enter birth day (1-31): ");
        int birthDay = input.nextInt();
        System.out.print("Enter birth year: ");
        int birthYear = input.nextInt();

        // Creating an instance of HeartRates using the user's input
        HeartRates person = new HeartRates(firstName, lastName, birthMonth, birthDay, birthYear);

        // Displaying the heart rate information
        person.displayInfo();

        input.close(); // Closing the scanner resource
    }
}
