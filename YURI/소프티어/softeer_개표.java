import java.io.*;
import java.util.*;

public class Main {

    static int T;
    static int n;
    static int quotient;
    static int remainder;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();

        for(int i = 0; i < T; i++) {
            n = sc.nextInt();
            quotient = n / 5;
            remainder = n % 5;


            for(int j = 0; j < quotient; j++){
                System.out.print("++++");
                if(j+1 < quotient || remainder > 0)
                    System.out.print(" ");
            }
            for(int j = 0; j < remainder; j++) {
                System.out.print("|");
            }
            if(i+1 < T) {
                System.out.print("\n");
            }
        }
    }
}
