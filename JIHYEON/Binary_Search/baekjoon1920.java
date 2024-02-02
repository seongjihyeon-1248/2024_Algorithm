//https://www.acmicpc.net/problem/1920

package JIHYEON.Binary_Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon1920 { 
	public static int[] arr;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());    // 배열 요소 개수
		arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 이진탐색은 기본적으로 정렬된 배열 사용
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine()); // 찾을 요소 개수
		
		st = new StringTokenizer(br.readLine(), " ");
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < M; i++) {
			if(binarySearch(Integer.parseInt(st.nextToken())) != -1) {
				sb.append(1).append('\n');
			}
			else {
				sb.append(0).append('\n');
			}
		}
		System.out.println(sb);
	}
	
	
	//이진탐색 알고리즘
	public static int binarySearch(int key) {
 
		int low = 0;		
		int high = arr.length - 1;	    
 
		// low가 high보다 커지기(못 찾을 경우) 전까지 반복
		while(low <= high) {
 
			int mid = (low + high) / 2;
 
			if(key < arr[mid]) {
				high = mid - 1;
			}
			else if(key > arr[mid]) {
				low = mid + 1;
			}
			else {
				return mid; 
			}
		}
		return -1;
 
	}
}