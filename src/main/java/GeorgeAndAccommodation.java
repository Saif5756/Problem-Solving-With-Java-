import java.util.Scanner;

/**
 * Solution for the George and Accommodation problem.
 *
 * <p>This program determines how many rooms can accommodate at least
 * two additional people. For each room, the current number of occupants
 * and the room capacity are provided. A room is considered suitable if
 * the difference between its capacity and current occupants is greater
 * than or equal to 2.</p>
 *
 * <p>Algorithm:
 * <ul>
 *     <li>Read the number of rooms (n).</li>
 *     <li>Iterate through each room and read current occupants and capacity.</li>
 *     <li>Check if the room has space for at least two more people.</li>
 *     <li>Count such rooms and print the result.</li>
 * </ul>
 * </p>
 *
 * <p>Time Complexity: O(n)</p>
 * <p>Space Complexity: O(1)</p>
 */
public class GeorgeAndAccommodation {

    public static void main(String[] args) {

        // Scanner object to read input from standard input
        Scanner scan = new Scanner(System.in);

        // Number of rooms
        int n = scan.nextInt();

        // Counter for rooms that can accommodate at least two more people
        int count = 0;

        // Iterate over each room
        for (int i = 0; i < n; i++) {

            // Current number of occupants
            int num1 = scan.nextInt();

            // Room capacity
            int num2 = scan.nextInt();

            // Check if room has space for at least two additional people
            if (num2 - num1 >= 2) {
                count++;
            }
        }

        // Output the number of suitable rooms
        System.out.println(count);

        // Close scanner to prevent resource leak
        scan.close();
    }
}