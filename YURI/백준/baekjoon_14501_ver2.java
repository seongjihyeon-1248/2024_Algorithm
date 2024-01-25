import java.util.*;

// dp 풀이
public class Main {
    static int N;
    static int[][] planner;
    static int[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();   // 회사에 남아있는 기간
        planner = new int[N][2];
        dp = new int[N + 1];

        for(int i = 0; i < N; i++) {
            planner[i][0] = sc.nextInt();
            planner[i][1] = sc.nextInt();
        }

        dynamincProgramming();
        System.out.println(dp[0]);

    }

    public static void dynamincProgramming() {
        for(int i = N - 1; i >= 0; i--) {   // 뒤에서부터 계산
            if(planner[i][0] + i > N)
                dp[i] = dp[i+1];
            else
                dp[i] = Math.max(dp[i + planner[i][0]] + planner[i][1], dp[i+1]);
        }
    }

}
