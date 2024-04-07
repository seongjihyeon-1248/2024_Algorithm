//https://www.acmicpc.net/problem/10773

package JIHYEON.Data_Structures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon_10773 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
        Stack<Integer> k = new Stack<>();
        for(int i = 0; i < K; i++){
            int n = Integer.parseInt(br.readLine());
            if(n == 0){
                k.pop();
            }
            else{
                k.push(n);
            }
        }
        int sum=0;
		while(!k.isEmpty()) {
			sum += k.pop();
		}
		System.out.println(sum);
        br.close();
    }
}