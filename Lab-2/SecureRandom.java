import java.util.Random;
import java.util.Scanner;

public class CS212 {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Multiplication Activity (CAI)");
            System.out.print("Enter the difficulty level (1 - 3): ");
            // variables to store total questions (modifiable) and the number of correct answers
            int totalQuestions = 10, correctAnswers = 0;
            int difficultyLevel = scanner.nextInt();
           
            for (int i = 0; i < totalQuestions; i++) {
                SecureRandom randomObject = new SecureRandom(difficultyLevel);
                randomObject.askQuestion();
                int userChoice;
                userChoice = scanner.nextInt();

                if (userChoice == randomObject.answer) {
                    SecureRandom.commentCorrect();
                    correctAnswers++;
                }
                else SecureRandom.commentWrong();
            }

            float obtainedPercentage = ((float)correctAnswers / (float)totalQuestions) * 100;
            System.out.println("-- Required questions were attempted --");
            System.out.println("Total Questions: " + totalQuestions);
            System.out.println("Correct Answers: " + correctAnswers);
            System.out.println("Obtained Percentage: " + (int)obtainedPercentage);
            if (obtainedPercentage <= 75) System.out.println("Please ask your teacher for extra help.");
            else System.out.println("Congratulations, you are ready to go to the next level!");

            System.out.print("Exit the program (y/n)? ");
            char choice = Character.toLowerCase(scanner.next().charAt(0));
            if (choice == 'y') break;
            // print a new line before the program restarts asking questions for the next student
            System.out.println();
        }
    }
}

class SecureRandom {
    int randomNum1, randomNum2, answer, upperBound = 1, lowerBound;
    
    SecureRandom(int difficultyLevel) {
        Random random = new Random();
        for (int i = 0; i < difficultyLevel; i++) {
            this.upperBound = this.upperBound * 10;
            if (i == difficultyLevel - 1) this.upperBound--;
        }
        this.lowerBound = (upperBound + 1) / 10;
        this.randomNum1 = random.nextInt(upperBound - lowerBound) + lowerBound;
        this.randomNum2 = random.nextInt(upperBound - lowerBound) + lowerBound;
        this.answer = randomNum1 * randomNum2;
    }
    public void askQuestion() {
        System.out.printf("How much is %d times %d?%n", this.randomNum1, this.randomNum2);
    }
    public static void commentCorrect(){
        // generates a random number between 1 and 4
        Random random = new Random();
        switch (random.nextInt(4 - 1) + 1) {
            case 1:
                System.out.println("Very good!");
                break;
            case 2:
                System.out.println("Excellent!");
                break;
            case 3:
                System.out.println("Nice work!");
                break;
            case 4:
                System.out.println("Keep up the good work!");
                break;
        }
    }
    public static void commentWrong(){
        // generates a random number between 1 and 4
        Random random = new Random();
        switch (random.nextInt(4 - 1) + 1) {
            case 1:
                System.out.println("No. Please try again.");
                break;
            case 2:
                System.out.println("Wrong. Try once more.");
                break;
            case 3:
                System.out.println("Don't give up!");
                break;
            case 4:
                System.out.println("No. Keep trying.");
                break;
        }
    }
}
