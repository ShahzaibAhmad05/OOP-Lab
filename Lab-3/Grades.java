import java.util.Scanner;

public class CS212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input the number of students and subjects
        System.out.print("Enter the number of students: ");
        int students = scanner.nextInt();
        System.out.print("Enter the number of subjects: ");
        int subjects = scanner.nextInt();
        // initialize an array to store grades
        int[][] grades = new int[students][subjects];
        
        // input grades for each student, for each subject
        for (int i = 0; i < students; i++) {
            System.out.println("Enter the grades for student " + (i + 1) + ":");
            for (int j = 0; j < subjects; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                char temp = scanner.next().toLowerCase().charAt(0);
                switch (temp) {
                    case 'a':
                        grades[i][j] = 20;
                        break;
                    case 'b':
                        grades[i][j] = 15;
                        break;
                    case 'c':
                        grades[i][j] = 10;
                        break;
                    case 'f':
                        grades[i][j] = 0;
                        break;
                    default:
                        grades[i][j] = -1;
                        // -1 indicates that an invalid grade was entered
                }
            }
        }
        // calculate and display averages, find the top-performing student
        int topStudent = 0, total;
        double highestAverage = 0;

        System.out.println("\nStudent Grades and Averages:");
        for (int i = 0; i < students; i++) {
            total = 0;
            for (int j = 0; j < subjects; j++) {
                System.out.print(grades[i][j] + " ");
                total += grades[i][j];
            }

            double average = (double) total / subjects;
            System.out.printf("-> Average: %.2f%n", average);

            // check if this student has the highest average, so far
            if (average > highestAverage) {
                highestAverage = average;
                topStudent = i;
            }
        }
        // output the top-performing student
        System.out.println("\nTop-performing student: Student " + (topStudent + 1));
        System.out.printf("Highest Average: %.2f%n", highestAverage);
        scanner.close();    // close the scanner
    }
}
