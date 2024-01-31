//https://www.acmicpc.net/problem/2839

package JIHYEON.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2839 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // 3를 최소한으로
        for(int i = 0; i <= N/3; i++) {
			for(int ii = 0; ii <= N/5; ii++) {
				if( i * 3 + ii * 5 == N){
                    System.out.print(i + ii);
                    return;
                }
            }
        }
        System.out.print("-1");
    }
}