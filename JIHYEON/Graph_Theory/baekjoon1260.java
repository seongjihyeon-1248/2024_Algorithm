//https://www.acmicpc.net/problem/1260

package JIHYEON.Graph_Theory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon1260 {
    static StringBuilder sb = new StringBuilder();
	static int[][] arr; //간선
    static boolean[] check; // 탐색한 정점
    static int N;   // 정점의 개수
	static Queue<Integer> q = new LinkedList<>();

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());   //간선의 개수
        int V = Integer.parseInt(st.nextToken());   //탐색을 시작할 정점의 번호

        check = new boolean[N+1];
        arr = new int[N+1][N+1];
		
		for(int i = 0 ; i < M ; i ++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(str.nextToken());
			int b = Integer.parseInt(str.nextToken());
			arr[a][b] = arr[b][a] =  1;	
		}

		dfs(V);

		sb.append("\n");
		check = new boolean[N+1];
			
		bfs(V);
			
		System.out.println(sb);
		
	}

    //재귀문
	public static void dfs(int v) {
		
		check[v] = true; // 탐색할 정점
		sb.append(v + " ");
		
        //인접한 정점 중 작은 정점부터 탐색
		for(int i = 0 ; i <= N ; i++) {
            //아직 탐색하지 않은 정점이면 해당 정점으로 이어서 탐색
			if(arr[v][i] == 1 && !check[i]) 
				dfs(i); 
		}
		
	}
	
    //반복문, q 사용
	public static void bfs(int v) {

        check[v] = true; // 탐색할 정점
		q.add(v);   //큐에 탐색할 정점을 넣음

        //인접한 정점이 없을 때까지 반복
		while(!q.isEmpty()) {
			
			v = q.poll();   //큐에서 탐색할 정점을 poll
			sb.append(v + " ");

            //인접한 정점 중 작은 정점부터 탐색
			for(int i = 1 ; i <= N ; i++) {
                //아직 탐색하지 않은 정점이면 큐에 모두 넣음
				if(arr[v][i] == 1 && !check[i]) {
					q.add(i);
					check[i] = true;
				}
			}
            //해당 정점에 인접한 정점들을 모두 q에 넣음으로서 가까운 정점부터 넓이 우선으로 탐색 가능
		}
	}
}
