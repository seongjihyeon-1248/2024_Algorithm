import java.util.*;
import java.io.*;

public class Main {

    static int T;
    static int x;
    static int y;
    static int minX;
    static int minY;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        minX = 10000;
        minY = 10000;
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            if (y < minY) {
                minX = x;
                minY = y;
            }
        }
        System.out.print(minX + " " + minY);
    }
}
