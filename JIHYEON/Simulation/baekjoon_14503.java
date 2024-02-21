//https://www.acmicpc.net/problem/14503

package JIHYEON.Simulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class baekjoon_14503 {
    static int[][] direction = new int[][]{{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
	static int[][] table;
    static int N;
    static int M;
    static int count;
    public static void main(String[] args) throws IOException {
		//입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        table = new int[N][M];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int ii = 0; ii < M; ii++)
                table[i][ii] = Integer.parseInt(st.nextToken());
        }


        count = 0;
        while(true){
            if(table[r][c] == 0)
                clean(r, c);
            if(nesw_check(r, c)){
                do{
                    d = (d + 3) % 4;
                }while (!check(d, r, c));
                r += direction[d][0];
                c += direction[d][1];
            }
            else{
                d = (d + 2) % 4; 
                if(table[r + direction[d][0]][c + direction[d][1]] != 1){ 
                    r += direction[d][0]; 
                    c += direction[d][1];
                }
                else{ break; }
                d = (d + 2) % 4; 
            }
        }
        System.out.print(count);
	}
    static void clean(int r, int c){
        table[r][c] = -1;
        count++;
    }
    static boolean check(int d, int r, int c){
        if(table[r + direction[d][0]][c + direction[d][1]] == 0)
            return true;
        return false;
    }
    static boolean nesw_check(int r, int c){
        for(int i = 0; i < 4; i++){
            if(check(i, r, c)){
                return true;
            }
        }
        return false;
    }
}