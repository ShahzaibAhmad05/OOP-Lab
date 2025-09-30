// java program to take the masses of two objects and the distance between them
import java.util.Scanner;

public class GravitationalForce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double G = 6.67430e-11; // constant double for Gravitational constant
        // taking values of masses for both objects
        System.out.print("Enter mass of first object in kilograms: ");
        double mass1 = scanner.nextDouble();
        System.out.print("Enter mass of second object in kilograms: ");
        double mass2 = scanner.nextDouble();
        // taking the value of distance for both objects
        System.out.print("Enter distance between the objects in meters: ");
        double distance = scanner.nextDouble();

        // calculation of gravitational force
        double force = (G * mass1 * mass2) / (distance * distance);
        // print in scientific notation displaying 6 decimal places
        System.out.printf("\nThe gravitational force between the objects is: %.6e", force);
        
        scanner.close();    // close the scanner
    }
}
