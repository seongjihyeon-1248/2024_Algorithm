//https://www.acmicpc.net/problem/2606

package JIHYEON.Graph_Theory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon2606 {
    static int N;   // 정점의 개수
    static int[][] arr; //간선
    static boolean[] check; // 탐색한 정점
	static Queue<Integer> q = new LinkedList<>();

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());   //간선의 개수
        arr = new int[N+1][N+1];
        check = new boolean[N+1];


		for(int i = 0 ; i < M ; i ++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = arr[b][a] =  1;	
		}
			
		bfs();
		
	}
	
	public static void bfs() {

        check[1] = true; 
		q.add(1);   
        int count = 0;

		while(!q.isEmpty()) {
			
			int v = q.poll();   
			count++;
            System.out.println(v);

			for(int i = 1 ; i <= N ; i++) {
				if(arr[v][i] == 1 && !check[i]) {
					q.add(i);
					check[i] = true;
				}
			}
		}
        System.out.println(count - 1);
	}
}
