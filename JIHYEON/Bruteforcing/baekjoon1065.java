package JIHYEON.Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1065 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(hansu(Integer.parseInt(br.readLine())));
    }
    public static int hansu(int n) {
		if (n < 100) {
			return n;
		}
 
		else {
			int cnt = 99;
 
			for (int i = 100; i <= n; i++) {
				int hun = i / 100;          // 백의 자릿수
				int ten = (i / 10) % 10;    // 십의 자릿수
				int one = i % 10;           // 십의 자릿수
 
                // 각 자릿수가 등차수열
				if ((hun - ten) == (ten - one)) {
					cnt++;
				}
			}
            return cnt;
		}
        
	}
}
