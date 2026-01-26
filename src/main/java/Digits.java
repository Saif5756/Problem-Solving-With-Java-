import java.util.Scanner;

import static javax.swing.text.html.HTML.Attribute.N;

public class Digits {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int T =scan.nextInt();
            for (int i =0;i<T;i++){

              long N = scan.nextLong();
              if (N==0){
                  System.out.println(0);
                  continue;
              }

              while(N!=0){
                  int N2= (int) (N%10);
                  System.out.print(N2+" ");
                  N/=10;
              }
                System.out.println();
            }
        scan.close();
    }

}
