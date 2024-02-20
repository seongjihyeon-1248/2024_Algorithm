import java.util.*;

public class Main {
    static int N;
    static int M;
    static int[][] map;
    static ArrayList<Point> space = new ArrayList<>();
    static ArrayList<Point> virus = new ArrayList<>();
    static int answer;
    static int CNT;
    static int[] visited;
    static int[] dc = {0, 1, 0, -1};
    static int[] dr = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[N][M];
        answer = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                map[i][j] = sc.nextInt();
                if(map[i][j] == 0)
                    space.add(new Point(i, j));
                else if(map[i][j] == 2)
                    virus.add(new Point(i, j));
            }
        }

        CNT = space.size();
        visited = new int[CNT];

        dfs(0, new ArrayList<>());
        System.out.println(answer);

    }

    public static void dfs(int n, ArrayList clist) {
        if(n==3) {
            answer = Math.max(answer, bfs(clist));
            return;
        }

        for(int i = 0; i < CNT; i++) {
            if(visited[i] == 0) {
                visited[i] = 1;
                ArrayList<Point> copyClist = new ArrayList<>();
                copyClist.addAll(clist);
                copyClist.add(space.get(i));
                dfs(n+1, copyClist);
                visited[i] = 0;
            }
        }
    }

    public static int bfs(ArrayList<Point> clist) {
        // 3개 좌표를 1로 지정하여 벽 만들기
        for(Point p : clist)
            map[p.c][p.r] = 1;

        Queue<Point> q = new LinkedList<>();
        int[][] visitedMap = new int[N][M];

        int cnt = CNT - 3; // 남아있는 빈칸의 개수

        for(Point p : virus) {
            q.add(p);
            visitedMap[p.c][p.r] = 1;
        }

        while(!q.isEmpty()) {
            Point p = q.poll();

            for(int i = 0; i < 4; i++) {
                int tc = p.c;
                int tr = p.r;
                tc += dc[i];
                tr += dr[i];

                if(0<=tc && N>tc && 0<=tr && M>tr && visitedMap[tc][tr]==0 && map[tc][tr] == 0) {
                    q.add(new Point(tc, tr));
                    visitedMap[tc][tr] = 1;
                    cnt-=1;
                }
            }
        }

        // 처음에 만든 벽 3개 없애기
        for(Point p : clist)
            map[p.c][p.r] = 0;

        return cnt;
    }

}

class Point{
    int c;
    int r;
    public Point(int c, int r) {
        this.c = c;
        this.r = r;
    }
}
