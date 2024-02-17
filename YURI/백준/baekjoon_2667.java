import java.util.*;

public class Main {

    static int N;
    static int[][] map;
    static int[][] visited;
    static int[] count;
    static int num;
    static int[] dc = {-1, 0, 1, 0};
    static int[] dr = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        map = new int[N+2][N+2];
        visited = new int[N+2][N+2];
        num = 0;    // 단지 번호

        // 배열을 -1로 두르기
        for (int i = 0; i < N+2; i++) {
            map[0][i] = -1;     // 맨 윗 행
            map[N+1][i] = -1;   // 맨 아랫 행
            map[i][0] = -1;     // 맨 왼쪽 열
            map[i][N+1] = -1;   // 맨 오른쪽 열
        }

        for(int i = 1; i < N+1; i++) {
            String s = sc.next();
            for(int j = 0; j < N; j++) {
                map[i][j+1] = Character.getNumericValue(s.charAt(j));
            }
        }

        // 집이 있는 해당 위치를 아직 방문하지 않았다면 방문.
        for(int i = 1; i < N+1; i++) {
            for(int j = 1; j < N+1; j++) {
                if(map[i][j] == 1 && visited[i][j] == 0) {
                    num++;
                    bfs(i, j);
                }
            }
        }

        count = new int[num];

        for(int i = 1; i < N+1; i++) {
            for(int j = 1; j < N+1; j++) {
                if(visited[i][j] > 0) {
                    count[visited[i][j]-1]++;
                }
            }
        }

        Arrays.sort(count);

        System.out.println(num);
        for(int i : count) {
            System.out.println(i);
        }
    }

    // 상하좌우를 확인하여 바로 옆에 있는 집을 방문하지 않았다면 표시.
    public static void bfs(int c, int r) {
        
        visited[c][r] = num;
        
        for(int i = 0; i < 4; i++) {
            if(map[c+dc[i]][r+dr[i]] == 1 && visited[c+dc[i]][r+dr[i]] == 0)
                bfs(c+dc[i], r+dr[i]);
        }
    }
}
