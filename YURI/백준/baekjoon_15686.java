import java.util.*;

public class Main {

    static int N;
    static int M;
    static int[][] map;
    static int result = 100000000;
    static ArrayList<Point> chicken;
    static ArrayList<Point> home;
    static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        map = new int[N][N];

        chicken = new ArrayList<>();
        home = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
                if(map[i][j] == 2)
                    chicken.add(new Point(i, j));
                else if(map[i][j] == 1)
                    home.add(new Point(i, j));
            }
        }

        cnt = chicken.size();

        dfs(0, new ArrayList<Point>());
        System.out.println(result);
    }

    public static void dfs(int n, ArrayList<Point> tmpList) {
        if(n == cnt) { // 이 경우 종료.
            if(tmpList.size() == M) // 이 경우 최소값을 선정할 것.
                result = Math.min(cal(tmpList), result);
            return;
        }

        // 현재 치킨집을 선택하지 않는 경우.
        dfs(n+1, tmpList);
        // 현재 치킨집을 선택하는 경우.
        ArrayList<Point> newList = new ArrayList<>();
        newList.addAll(tmpList);
        newList.add(chicken.get(n));
        dfs(n+1, newList);
    }

    public static int cal(ArrayList<Point> tmpList) {

        int sum = 0;

        for(Point h : home) {
            int min = 100000000;
            for(Point c : tmpList) {
                int distance = Math.abs(h.c - c.c) + Math.abs(h.r - c.r);
                if(min > distance)
                    min = distance;
            }
            sum += min;
        }

        return sum;
    }
}

class Point {
    public int c;
    public int r;

    public Point(int c, int r) {
        this.c = c;
        this.r = r;
    }
}
