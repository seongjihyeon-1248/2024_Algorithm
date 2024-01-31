import java.util.*;
import java.io.*;

public class Main {

    static int n;
    static int[] F;
    static StringTokenizer st;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        F = new int[n];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            F[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(F);
        max = F[n-1] * F[n-2];
        if(F[0] * F[1] > max)
            max = F[0] * F[1];

        System.out.print(max);
    }

}
