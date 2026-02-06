import java.util.Scanner;

public class DominoPiling {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Read the number of rows (M) of the board
        int m = scanner.nextInt();

        // Read the number of columns (N) of the board
        int n = scanner.nextInt();

        // Calculate the maximum number of dominoes that can be placed
        // Each domino covers 2 squares, so divide the total number of squares by 2
        int result = m * n / 2;

        // Print the result
        System.out.println(result);

        // Close the Scanner to prevent resource leaks
        scanner.close();
    }
}
