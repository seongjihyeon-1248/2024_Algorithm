package JIHYEON.Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon1018 {
    public static boolean[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
        int min = 32;
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
 
        arr = new boolean[N][M];
        
        // 배열 입력 
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true;		// W일 때는 true 
                } else {
                    arr[i][j] = false;		// B일 때는 false
                }
 
            }
        }
 
        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                min = Math.min(min, find(i, j));
            }
        }
        System.out.println(min);
    }
 
    
    public static int find(int x, int y) {
        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;
 
        boolean TF = true;	
 
        for (int i = x; i < end_x; i++) {
            for (int j = y; j < end_y; j++) {
                if (arr[i][j] != TF) {	
                    count++;
                }
                TF = !TF;
            }
            
            TF = !TF;
        }
        
        //TF가 false였을 경우의 경우와 true였을 경우의 최소값 반환
        return  Math.min(count, 64 - count);
    }
}        
