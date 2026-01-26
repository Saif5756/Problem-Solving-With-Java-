import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        scanner.close();

        if (N >= 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}