import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int x=0;

        for (int i = 0; i < n; i++) {
            String r = scanner.next();
            if (r.contains("++")){
                x++;
            } else if (r.contains("--")) {
                x--;
            }
        }
        System.out.println(x);
    }
}
