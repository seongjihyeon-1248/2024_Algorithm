//https://www.acmicpc.net/problem/1149

import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
 
public class baekjoon_1149 {
	
	final static int Red = 0;
	final static int Green = 1;
	final static int Blue = 2;
	
	static int[][] cost;
	static int[][] dp;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		cost = new int[N][3];
		dp = new int[N][3];
		
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			cost[i][0] = Integer.parseInt(st.nextToken());
			cost[i][1] = Integer.parseInt(st.nextToken());
			cost[i][2] = Integer.parseInt(st.nextToken());
		}
		
		dp[0][0] = cost[0][0];
		dp[0][1] = cost[0][1];
		dp[0][2] = cost[0][2];
		
        for(int i = 1; i < N; i++){
            dp[i][0] = Math.min(dp[i-1][1],dp[i-1][2]) + cost[i][0];
            dp[i][1] = Math.min(dp[i-1][0],dp[i-1][2]) + cost[i][1];
            dp[i][2] = Math.min(dp[i-1][0],dp[i-1][1]) + cost[i][2];
        }

		System.out.println(Math.min(dp[N-1][0], Math.min(dp[N-1][1], dp[N-1][2])));
	}
}