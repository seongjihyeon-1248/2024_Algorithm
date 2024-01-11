//https://www.acmicpc.net/problem/10816

package JIHYEON.Set_and_Map_By_Hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baekjoon10816 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<String, Integer>();

		int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (N-- > 0) {
            String st_next = st.nextToken();
            if(!map.containsKey(st_next)) {
                map.put(st_next, 1);
            }
            else {
                map.put(st_next, map.get(st_next) + 1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (M-- > 0) {
            String st_next = st.nextToken();
            if(!map.containsKey(st_next)) {
                sb.append("0 ");
            }
            else {
                sb.append(map.get(st_next)).append(" ");
            }
        }
        System.out.print(sb);
        br.close();
    }
}