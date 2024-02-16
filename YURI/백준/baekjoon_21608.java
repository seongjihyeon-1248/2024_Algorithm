import java.util.*;

public class Main {

    static int N;
    static int[][] students;
    static int[][] map;
    static int blank;
    static int like;
    static int maxBlank;
    static int maxLike;
    static int resultC;
    static int resultR;
    static int result;

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       N = sc.nextInt();
       students = new int[N*N][5];
       map = new int[N+2][N+2];

       // 맵의 테두리를 -1로 둘러 맵 탐색 시 범위를 따로 정해주지 않도록 함.
        for (int i = 0; i < N+2; i++) {
            map[0][i] = -1;     // 맨 윗 행
            map[N+1][i] = -1;   // 맨 아랫 행
            map[i][0] = -1;     // 맨 왼쪽 열
            map[i][N+1] = -1;   // 맨 오른쪽 열
        }

       for(int i = 0; i < N*N; i++) {
           for(int j = 0; j < 5; j++) {
               students[i][j] = sc.nextInt();
           }
       }

       // 학생들을 어느 자리에 배치할 것인지 결정
        for(int i = 0; i < N*N; i++) {
            resultR = 0; resultC = 0;
            tour(i);
            map[resultC][resultR] = students[i][0];
        }

        // 배치된 자리의 만족도 조사
        result = 0;
        for(int i = 1; i < N+2; i++) {
            for (int j = 1; j < N + 2; j++) {
                likeLevel(i, j, map[i][j]);
            }
        }

        System.out.println(result);

    }

    // 학생 별 자리를 정하기 위해 한 위치의 상하좌우를 확인하여 최적의 자리를 찾아냄
    public static void tour(int student) {
        maxBlank = -1; maxLike = -1;
        for(int i = 0; i < N+2; i++) {
            for(int j = 0; j < N+2; j++) {
                if(map[i][j] == 0) {
                    blank = 0; like = 0;
                    compare(i-1, j, student);
                    compare(i+1, j, student);
                    compare(i, j-1, student);
                    compare(i, j+1, student);
                    // 여기서 맥스값과 비교. 해당 자리를 저장해야됨.
                    if(like > maxLike || (like == maxLike && blank > maxBlank)) {
                        maxBlank = blank;
                        maxLike = like;
                        resultC = i;
                        resultR = j;
                    }
                }
            }
        }
    }

    // 해당 위치가 빈칸인지, 혹은 student의 좋아하는 학생이 앉아있는지 확인
    public static void compare(int c, int r, int student) {
        if(map[c][r] == 0)
            blank++;
        else{
            for(int k = 1; k < 5; k++) {
                if(students[student][k] == map[c][r])
                    like++;
            }
        }
    }

    // 배치된 자리 상하좌우에 좋아하는 학생이 얼마나 있는지 확인하여 결과를 알아냄
    public static void likeLevel(int c, int r, int student) {
        for(int i = 0; i < N*N; i++) {
            if(students[i][0] == student) {
                like = 0;
                compare(c-1, r, i);
                compare(c+1, r, i);
                compare(c, r-1, i);
                compare(c, r+1, i);

                result += (int) Math.pow(10, like-1);

            }
        }
    }

}
