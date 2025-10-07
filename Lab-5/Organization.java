public class Organization {
    public static void main(String[] args) {
        // Create Employee objects
        Employee emp1 = new Employee("John Doe", 101, 50000, 4);
        Employee emp2 = new Employee("John Williams", 102, 60000, 5);

        // Print initial details
        System.out.println("Starting Employee Details:");
        emp1.printDetails();
        emp2.printDetails();

        // Attempt to set an invalid salary
        emp1.setSalary(-5000); // Invalid salary
        emp2.setPerformanceRating(6); // Invalid performance rating

        // Print details after invalid attempts
        System.out.println("\nAfter some Invalid Inputs:");
        emp1.printDetails();
        emp2.printDetails();

        // HR updates salary and performance rating
        HR hr = new HR();
        hr.updateSalary(emp1, 70000); // Valid salary
        hr.updatePerformance(emp2, 3); // Valid performance rating

        // Print details after updates
        System.out.println("\nAfter some HR Updates:");
        emp1.printDetails();
        emp2.printDetails();
    }
}

class Employee {
    private final String name;
    private final int id;
    private double salary;
    private int performanceRating;

    // Constructor to initialize Employee
    public Employee(String name, int id, double salary, int performanceRating) {
        this.name = name;
        this.id = id;
        setSalary(salary); // Setter to validate salary
        setPerformanceRating(performanceRating); // Setter to validate rating
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary (only HR can access)
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary! Salary cannot be negative.");
        }
    }

    // Getter for performanceRating
    public int getPerformanceRating() {
        return performanceRating;
    }

    // Setter for performanceRating
    public void setPerformanceRating(int performanceRating) {
        // Validate performance rating
        if (performanceRating >= 1 && performanceRating <= 5) {
            this.performanceRating = performanceRating;
        } else {
            System.out.println("Invalid performance rating! Rating should be between 1 and 5.");
        }
    }

    // Method to print Employee details
    public void printDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Performance Rating: " + performanceRating);
    }
}

class HR {
    // HR can update salary
    public void updateSalary(Employee employee, double salary) {
        employee.setSalary(salary);
    }

    // HR can also update performance rating (for example, after evaluations)
    public void updatePerformance(Employee employee, int rating) {
        employee.setPerformanceRating(rating);
    }
}

