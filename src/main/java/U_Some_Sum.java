import java.util.Scanner;

public class U_Some_Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();

        long sum = 0;

        for (int i = 1; i <= N; i++) {
            int temp = i;
            int digitSum = 0;

            while (temp > 0) {
                digitSum += temp % 10;
                temp /= 10;
            }

            if (digitSum >= A && digitSum <= B) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}