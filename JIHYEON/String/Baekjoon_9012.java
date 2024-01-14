// https://www.acmicpc.net/problem/9012

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
 
public class Baekjoon_9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
 
		int T = Integer.parseInt(br.readLine()); // 줄 개수 T
 
		//줄 마다 YES or No 판별
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
			//count가 0인데 닫는 괄호면 오류이므로 NO 바로 반환
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