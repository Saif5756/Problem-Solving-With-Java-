import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
       int n=scanner.nextInt();
        int count=0;
        for (int i = 0; i < n; i++) {
            int Petya=scanner.nextInt();
            int Vasya=scanner.nextInt();
            int Tonya =scanner.nextInt();
            int sum =Petya+Vasya+Tonya;

            if (sum>=2){
                count++;

            }
        }
        System.out.println(count);
    }
}
