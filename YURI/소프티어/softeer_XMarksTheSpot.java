import java.util.*;
import java.io.*;

public class Main {

    static int n;
    static String s;
    static String t;
    static StringBuilder sb;
    static StringTokenizer st;
    static int index;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            s = st.nextToken().toUpperCase();
            t = st.nextToken().toUpperCase();
            index = s.indexOf("X");
            sb.append(t.charAt(index));
        }

        System.out.print(sb);

    }
}
