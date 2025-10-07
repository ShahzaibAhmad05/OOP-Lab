import java.util.Scanner;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;
    private int experienceYears;

    // Constructor to initialize employee details
    public Employee(String firstName, String lastName, double monthlySalary, int experienceYears) {
        this.firstName = firstName;
        this.lastName = lastName;
        // Ensuring salary is non-negative
        this.monthlySalary = (monthlySalary > 0) ? monthlySalary : 0.0;
        // Ensuring experience years is non-negative
        this.experienceYears = (experienceYears > 0) ? experienceYears : 0;
    }

    // Method to compute and return the annual salary
    public double getAnnualSalary() {
        return monthlySalary * 12;
    }

    // Method to update salary based on experience and appraisal
    public void applyAppraisal() {
        // Increase is 10% of monthly salary per year of experience
        double increase = experienceYears * (0.10 * monthlySalary);
        monthlySalary += increase;  // Apply the increase
    }

    // Method to print out employee details
    public void displayEmployee() {
        System.out.println("\n--- Employee Information ---");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Monthly Salary: $" + monthlySalary);
        System.out.println("Annual Salary: $" + getAnnualSalary());
        System.out.println("Experience: " + experienceYears + " years");
    }

    // Main method to run the program and interact with users
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Gather details for the first employee
        System.out.print("Enter first name: ");
        String firstName1 = input.nextLine();
        System.out.print("Enter last name: ");
        String lastName1 = input.nextLine();
        System.out.print("Enter monthly salary: ");
        double salary1 = input.nextDouble();
        System.out.print("Enter years of experience: ");
        int experience1 = input.nextInt();
        input.nextLine(); // Consume any extra newline

        // Create the first employee object
        Employee employee1 = new Employee(firstName1, lastName1, salary1, experience1);

        // Gather details for the second employee
        System.out.print("\nEnter first name: ");
        String firstName2 = input.nextLine();
        System.out.print("Enter last name: ");
        String lastName2 = input.nextLine();
        System.out.print("Enter monthly salary: ");
        double salary2 = input.nextDouble();
        System.out.print("Enter years of experience: ");
        int experience2 = input.nextInt();

        // Create the second employee object
        Employee employee2 = new Employee(firstName2, lastName2, salary2, experience2);

        // Display the initial salary and experience before appraisal
        System.out.println("\nBefore Appraisal:");
        employee1.displayEmployee();
        employee2.displayEmployee();

        // Apply appraisals based on experience
        employee1.applyAppraisal();
        employee2.applyAppraisal();

        // Display updated salary and details after appraisal
        System.out.println("\nAfter Appraisal:");
        employee1.displayEmployee();
        employee2.displayEmployee();

        input.close(); // Close the scanner to avoid resource leaks
    }
}
