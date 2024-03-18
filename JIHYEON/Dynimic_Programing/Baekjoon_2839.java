//https://www.acmicpc.net/problem/2839

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
 
public class baekjoon_2839 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[N + 1];
        
        //한 봉지 가져가도 되는 경우들 초기화
        if (N >= 3)
			dp[3] = 1;
		if (N >= 5)
			dp[5] = 1;
		
        //6 ~ N의 각각 최소 경우 계산
        for (int i = 6; i <= N; i++) {
            //i가 5로 나누어 떨어지는 경우
            //5kg 봉지만 사용하는 것이 이득
			if (i % 5 == 0) {
				dp[i] = i / 5;
            //※ i가 5로 나누어 떨어지지 않고 ※ 3으로 나누어 떨어지는 경우
            //3kg 봉지 더하기 전의 최소 봉지 개수에 1(3kg 봉지)을 더한 값이 최소
			} else if (i % 3 == 0) {
				dp[i] = dp[i - 3] + 1;
            //나누어 떨어지지 않는 경우
            //3kg 봉지, 5kg 봉지를 더하기 전의 각각의 최소 봉지 개수 중 더 작은 값이 봉지 하나를 더한 값이 최소
			} else {
				if (dp[i - 3] != 0 && dp[i - 5] != 0) {
					dp[i] = Math.min(dp[i - 3], dp[i - 5]) + 1;
				}
			}
		}
		
        //N의 최소 값이 0이라는 것은 만들 수 있는 경우가 없음을 의미
        if (dp[N] == 0) {
			System.out.println("-1");
			return;
		}
		System.out.println(dp[N]);
	}
}