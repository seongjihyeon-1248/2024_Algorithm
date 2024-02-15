//https://www.acmicpc.net/problem/9012

package JIHYEON.Data_Structures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon_9012 {
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
		Stack<Character> stack = new Stack<>();
 
		for (char c : s.toCharArray()){
			if (c == '(') {
				stack.push(c);
			}
			// ')'를 입력 받았으나 pop할 원소가 없을 경우
			else if (stack.empty()) {
				return "NO";
			}
			else {
				stack.pop();
			}
		}
 
		if (stack.empty()) {
			return "YES";
		} 
		else {
			return "NO";
		}
	}
}