//https://www.acmicpc.net/problem/2667
package JIHYEON.Graph_Theory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

//dfs로 풀기
class baekjoon2667{
    static int N;
    static int[][] n;
    static int count;
    static int[] dy = {1, 0, -1, 0};
    static int[] dx = {0, 1, 0, -1};
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        ArrayList<Integer> dangy = new ArrayList<>();
        n = new int[N][N];
        for(int i = 0; i < N; i++){
            String str = br.readLine();
            for(int ii = 0; ii < N; ii++){
                n[i][ii] = str.charAt(ii) - '0';
            }
        }
        for(int i = 0; i  < N; i++){
            for(int ii = 0; ii < N; ii++){
                count = 1;
                if(n[i][ii] == 1){
                    n[i][ii] = 0;
                    search_dangy(i, ii);
                    dangy.add(count);
                }
            }
        }
        System.out.println(dangy.size());
        Collections.sort(dangy);
        for(int d: dangy){
            System.out.println(d);
        }
    }
    static void search_dangy(int x, int y){
        for(int i = 0; i < 4; i++){
            int xi = x + dx[i];
            int yi = y + dy[i];
            if(xi >= 0 && xi < N && yi >= 0 && yi < N){
                if(n[xi][yi] == 1){
                    count++;
                    n[xi][yi] = 0;
                    search_dangy(xi, yi);
                }
            }
        }
        return;
    }
}