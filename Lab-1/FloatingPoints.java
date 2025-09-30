// java program to calculate the sum, difference and average of two floating point numbers
import java.util.Scanner;

public class FloatingPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // take two floating point numbers as input
        System.out.print("Enter the first floating point number: ");
        float num1 = scanner.nextFloat();
        System.out.print("Enter the second floating point number: ");
        float num2 = scanner.nextFloat();
        
        // perform the calculations
        float sum = num1 + num2;
        float average = (num1 + num2) / 2;
        float difference = num1 - num2; // sum is first number - second number
        
        // display the results
        System.out.printf("%nThe sum is: %f%n", sum);   // %n in printf is the same as \n
        System.out.printf("The difference is: %f%n", difference);
        System.out.printf("The average is: %f%n", average);
        
        scanner.close();    // close the scanner
    }
}

