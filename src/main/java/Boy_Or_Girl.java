import java.util.Scanner;

public class Boy_Or_Girl {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        str.toLowerCase();
        long distinctCount = str.chars().distinct().count();
        if(distinctCount%2==0){
            System.out.println( "CHAT WITH HER!");
        }else {
            System.out.println("IGNORE HIM!");
        }


    }
}
