//https://www.acmicpc.net/problemset?sort=ac_desc&algo=25

package JIHYEON.Dynimic_Programing;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
 
public class Baekjoon2839 {

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int i, ii;
        // 5를 최소한으로
        for(i = N / 5; i >= 0; i--){
            for(ii = 0; ii <= (N - 5 * i) / 3; ii++)
                if(i * 5 + ii * 3 == N){
                    System.out.print(i + ii);
                    return;
                }
        }
        System.out.print("-1");
    }
}