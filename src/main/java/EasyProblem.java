import java.util.Scanner;

public class EasyProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean isHard = false;
        for (int i = 0; i < n; i++) ;
        int opinion = scan.nextInt();
        if (opinion == 1) {
            isHard = true;
        }
        if (isHard) {
            System.out.println("HARD");

        } else {
            System.out.println("EASY");
        }
    }
}