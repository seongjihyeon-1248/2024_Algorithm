import java.util.*;
import java.io.*;

public class Main {

    static int n;
    static int[] village;
    static int minDistance = 10000000;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        village = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
          village[i] = Integer.parseInt(st.nextToken());
        }

        for(int i =0 ; i < n-1; i++) {
          if(village[i+1] - village[i] < minDistance) {
              minDistance = village[i+1] - village[i];
          }
        }

        for(int i =0 ; i < n-1; i++) {
          if(village[i+1] - village[i] == minDistance) {
              result++;
          }
        }

        System.out.print(result);

    }
}
