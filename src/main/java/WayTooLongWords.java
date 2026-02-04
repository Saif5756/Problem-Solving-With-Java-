import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
              String st = scanner.next();
              if (st.length()>10){
                  System.out.print(st.charAt(0));
                  System.out.print(st.length()-2);
                  System.out.print(st.charAt(st.length()-1));
                  System.out.println(" ");
        }else {
                  System.out.println(st);
              }
    }
}
}
