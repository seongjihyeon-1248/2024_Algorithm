//https://www.acmicpc.net/problem/1654

package JIHYEON.Binary_Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon1654 { 
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		int K = Integer.parseInt(st.nextToken()); 
		int N = Integer.parseInt(st.nextToken()); 
 
		int[] arr = new int[K];
		
		long max = 0;
		for (int i = 0; i < K; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(max < arr[i]) {
				max = arr[i];
			}
		}
        //첫 mid값이 0이 나와 42번째 줄의 arr[i] / mid가 에러가 나지 않게 방지하기 위한 값 설정
		max += 1; 
 
		long min = 0; 
		long mid = 0; 
 
		while (min < max) { 
			
			mid = (max + min) / 2;
 
			long count = 0;
 
			for (int i = 0; i < arr.length; i++) {
				count += (arr[i] / mid);
			}
			
			if(count < N) {
				max = mid;
			}
			else {
				min = mid + 1;
			}
			
 
		}
		
		System.out.println(min - 1);
	}
}