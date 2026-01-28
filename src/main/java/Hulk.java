import java.util.Scanner;

public class Hulk {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        StringBuilder feeling = new StringBuilder();

        feeling.append("I hate");

        for (int i = 1; i < n; i++) {
            feeling.append(" that I ");
            if ((i + 1) % 2 == 0) {
                feeling.append("love");
            } else {
                feeling.append("hate");
            }
        }

        feeling.append(" it");
        System.out.println(feeling.toString());
    }

}
