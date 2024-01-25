import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int M;
    static int answer = 1000000000;
    static int[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        M = N/2;

        board = new int[N][N];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, new int[0], new int[0]);
        System.out.println(answer);

    }

    public static void dfs(int n, int[] startTeam, int[] linkTeam) {
        if(n == N) {
            if(startTeam.length ==  linkTeam.length) {
                answer = Math.min(answer, cal(startTeam, linkTeam));
            }
            return;
        }

        int[] newSTeam = new int[startTeam.length + 1];
        int[] newLTeam = new int[linkTeam.length + 1];

        for(int i = 0; i < startTeam.length; i++)
            newSTeam[i] = startTeam[i];

        for(int j = 0; j < linkTeam.length; j++)
            newLTeam[j] = linkTeam[j];

        newSTeam[startTeam.length] = n;
        newLTeam[linkTeam.length] = n;

        dfs(n+1, newSTeam , linkTeam);  // start 팀을 선택한 경우
        dfs(n+1, startTeam, newLTeam);  // link 팀을 선택한 경우
    }

    public static int cal(int[] startTeam, int[] linkTeam) {
        int sSum = 0; int lSum = 0;
        for(int i = 0; i < M; i ++) {
            for(int j = 0; j < M; j++) {
                sSum += board[startTeam[i]][startTeam[j]];
                lSum += board[linkTeam[i]][linkTeam[j]];
            }
        }
        return Math.abs(sSum - lSum);
    }
}
