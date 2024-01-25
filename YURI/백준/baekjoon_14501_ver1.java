import java.util.*;

// 백트래킹 풀이
public class Main {
    static int N;
    static int[][] planner;
    static int answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();   // 회사에 남아있는 기간
        planner = new int[N][2];
        answer = 0;

        for(int i = 0; i < N; i++) {
            planner[i][0] = sc.nextInt();
            planner[i][1] = sc.nextInt();
        }

        dfs(0, 0);
        System.out.println(answer);
    }

    public static void dfs(int n, int profit) {
        if(n >= N) {
            // 계산
            if(profit > answer)
                answer = profit;
            return;
        }

        if(n+planner[n][0] <= N)    // N일까지는 회사에 있기 때문에 N일도 포함.
            dfs(n + planner[n][0], profit + planner[n][1]);
        dfs(n + 1, profit);

    }
}
