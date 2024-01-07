// https://www.acmicpc.net/problem/9012

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
 
public class Baekjoon9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
 
		int T = Integer.parseInt(br.readLine());
 
		while (T-- > 0) {
			sb.append(bracket(br.readLine())).append('\n');
		}
		System.out.println(sb);
	}
 
	public static String bracket(String s) {
		int count = 0;
 
		for (char c : s.toCharArray()) {
			if (c == '(') {
				count++;
			}
			else if (count == 0) {
				return "NO";
			}
			else {
				count--;
			}
		}
 
		if (count == 0) {
			return "YES";
		} 
		else {
			return "NO";
		}
	}
}