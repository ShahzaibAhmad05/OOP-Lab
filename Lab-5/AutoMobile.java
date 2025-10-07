public class AutoMobile {
    public static void main(String[] args) {
        // Demonstrating different constructors

        // Create an automobile object with make and model
        Automobile auto1 = new Automobile("Toyota", "Corolla");
        auto1.displayDetails();  // Display details of the first automobile

        System.out.println(); // Blank line for separation

        // Create an automobile object with make, model, and year
        Automobile auto2 = new Automobile("Ford", "Mustang", 2023);
        auto2.displayDetails();  // Display details of the second automobile

        System.out.println(); // Blank line for separation

        // Create an automobile object with make, model, year, and price
        Automobile auto3 = new Automobile("Chevrolet", "Camaro", 2022, 35000.0);
        auto3.displayDetails();  // Display details of the third automobile
    }
}

class Automobile {
    // Attributes (private for encapsulation)
    private String make;
    private String model;
    private int year;
    private double price;

    // Constructor that takes make and model
    public Automobile(String make, String model) {
        this.make = make;
        this.model = model;
        this.year = 2020; // Default year if not provided
        this.price = 20000.0; // Default price if not provided
    }

    // Constructor that takes make, model, and year
    public Automobile(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = 20000.0; // Default price if not provided
    }

    // Constructor that takes make, model, year, and price
    public Automobile(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Getter and Setter for make
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    // Getter and Setter for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter and Setter for year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        // Simple validation to ensure a realistic year
        if (year > 1885 && year <= 2025) {
            this.year = year;
        } else {
            System.out.println("Invalid year. Please enter a valid year.");
        }
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        // Simple validation to ensure price is positive
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price. Please enter a positive value.");
        }
    }

    // Method to display automobile details
    public void displayDetails() {
        System.out.println("Automobile Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
}
