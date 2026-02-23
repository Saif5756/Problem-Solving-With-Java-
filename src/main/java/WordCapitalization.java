import java.util.Locale;
import java.util.Scanner;

public class WordCapitalization {
    public static void main(String args[]){
        Scanner scan = new Scanner( System.in );

        String st1 =scan.next();
        char first = Character.toUpperCase(st1.charAt(0));
        String word=st1.substring(1);
        System.out.println(first+word);
    }
}
