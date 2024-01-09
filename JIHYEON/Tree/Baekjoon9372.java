//https://www.acmicpc.net/problem/9372

package JIHYEON.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon9372 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

        StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			for (int i = 0; i < M; i++) {
				br.readLine();
			}
			sb.append((N - 1) + "\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}