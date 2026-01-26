import java.util.Scanner;

public class Bear_and_Big_Brother {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
            int Limak = scanner.nextInt();
            int Bob= scanner.nextInt();
            int counter = 0;
        while (Limak<=Bob){
            Limak*=3;
            Bob*=2;
            counter++;
        }
        System.out.println(counter);
    }
}
