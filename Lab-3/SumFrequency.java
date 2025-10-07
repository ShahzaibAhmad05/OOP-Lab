import java.util.Random;

public class SumFrequency {
    public static void main(String[] args) {
        Random random = new Random();
        /* 
        using an array to count the frequency of each possible sum.
        the sum can range from 2 to 12.
        */
        int[] sumFrequency = new int[13];
        // roll two dice 36,000,000 times using a for loop
        for (int i = 0; i < 36000000; i++) {
            // two dice with range 1 - 6
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            int sum = die1 + die2;      // get the sum
            sumFrequency[sum]++;        // increment the count for this sum
        }
        // display the test results in a format
        System.out.println("Sum\tFrequency");
        for (int sum = 2; sum <= 12; sum++) {
            System.out.println(sum + "\t" + sumFrequency[sum]);
        }
    }
}
