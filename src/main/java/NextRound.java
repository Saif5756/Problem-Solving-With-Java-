import java.util.Scanner;

public class NextRound {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Read the total number of participants 'n' and the qualifying position 'k'
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        // Initialize an array to store the scores of all participants
        int grade[] = new int[n];

        // Read the scores of each participant
        for (int i = 0; i < n; i++) {
            grade[i] = scanner.nextInt();
        }

        // Counter to track the number of participants who qualify for the next round
        int count = 0;

        // Iterate through all participants to check if they meet the qualifying criteria
        for (int i = 0; i < n; i++) {
            // Qualifying conditions:
            // 1. Score is greater than or equal to the score of the k-th place participant
            // 2. Score is strictly greater than 0 (participants with zero do not qualify)
            if (grade[i] >= grade[k - 1] && grade[i] > 0) {
                count++; // Increment the counter if the participant qualifies
            }
        }

        // Print the total number of participants who advance to the next round
        System.out.println(count);

        // Close the Scanner to free up resources
        scanner.close();
    }
}
