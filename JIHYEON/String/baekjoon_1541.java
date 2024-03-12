// https://www.acmicpc.net/problem/1541

package JIHYEON.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_1541 {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int sum = 0;	
		StringTokenizer minus = new StringTokenizer(br.readLine(), "-");
 
        StringTokenizer first = new StringTokenizer(minus.nextToken(), "+");
        while(first.hasMoreTokens()){
            sum += Integer.parseInt(first.nextToken());
        }

		while (minus.hasMoreTokens()) {
 
			StringTokenizer plus = new StringTokenizer(minus.nextToken(), "+");

			while (plus.hasMoreTokens()) {
				sum -= Integer.parseInt(plus.nextToken());
			}
		}
        
		System.out.println(sum);
	}
 
}