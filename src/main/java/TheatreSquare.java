import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long a = scanner.nextLong();

        long tilesN = (n + a - 1) / a;
        long tilesM = (m + a - 1) / a;

        long result = tilesN * tilesM;

        System.out.println(result);
    }
}
