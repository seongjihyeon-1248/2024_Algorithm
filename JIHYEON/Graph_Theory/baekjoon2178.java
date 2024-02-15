//https://www.acmicpc.net/problem/1260

package JIHYEON.Graph_Theory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class baekjoon2178 {
    static int N, M;
    static int[][] map; 
    static boolean[][] visited; 
    
    static int[] dy = {1, 0, -1, 0};
    static int[] dx = {0, 1, 0, -1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());;
        M = Integer.parseInt(st.nextToken());;
        
        map = new int[N][M];
        
        visited = new boolean[N][M]; 
        
        for(int i=0; i<N; i++) {
            String str = br.readLine();
            for(int j=0; j<M; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }
        
        bfs();

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }

        System.out.println(map[N-1][M-1]); 
    }
 
    public static void bfs() {
        LinkedList<int[]> queue = new LinkedList<int[]>();
 
        visited[0][0] = true; 
        queue.add(new int[] {0, 0});
        
        while(!queue.isEmpty()) {
            int[] tmp = queue.poll();
            
            //상하좌우
            for(int i=0; i<4; i++) { 
                int ny = tmp[0] + dy[i];
                int nx = tmp[1] + dx[i];
                if(ny >= 0 && nx >= 0 && ny < N && nx < M){
                    if(!visited[ny][nx] && map[ny][nx] == 1) {
                        visited[ny][nx] = true;
                        map[ny][nx] = map[tmp[0]][tmp[1]] + 1;
                        queue.add(new int[] {ny, nx});
                    }
                } 
            }
        }
    }
}
