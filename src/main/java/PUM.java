import java.util.Scanner;

public class PUM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int num = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(num++ + " ");
            System.out.print(num++ + " ");
            System.out.print(num++ + " ");
            System.out.println("PUM");
            num++;
        }
    }
}