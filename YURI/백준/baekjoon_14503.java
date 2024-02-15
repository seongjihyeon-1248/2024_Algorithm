import java.util.*;

public class Main {

    static int N;
    static int M;
    static int r;
    static int c;
    static int d;
    static int[][] map;

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};
    static int result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        map = new int[N][M];

        r = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        result = 0;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        while(true) {
            // 현재 위치 청소하기. 만약 벽이면 종료.
            if(!clean()) {
                System.out.println(result);
                return;
            }
            // 사방면에 빈 공간 있는지 반시계방향으로 확인 후 빈칸 있을 시 전진 없을 시 후진.
            moveToBlank();
        }
    }

    public static boolean clean() {
        if(map[r][c] == 0) {
            result++;
            map[r][c] = 2;
        }
        else if(map[r][c] == 1) {
            return false;
        }
        return true;
    }

    public static void moveToBlank() {
        int direction = d;
        for(int i = 0; i < 4; i++) {
            direction = (direction+3) % 4;
            if(map[r+dy[direction]][c+dx[direction]] == 0) {
                d = direction;
                r += dy[d];
                c += dx[d];
                return;
            }
        }
        r += dy[d]*(-1);
        c += dx[d]*(-1);
    }

    // public static void printMap() {
    //     for(int i = 0; i < N; i++) {
    //         for(int j = 0; j < M; j++) {
    //             System.out.print(map[i][j] + " ");
    //         }
    //         System.out.print("\n");
    //     }
    //     System.out.println("\n");
    // }
}
