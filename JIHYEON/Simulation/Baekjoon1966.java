//https://www.acmicpc.net/problem/1966

package JIHYEON.Simulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
import java.util.StringTokenizer;
import java.util.LinkedList;
 
public class Baekjoon1966 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine()); 
 
		while (T-- > 0) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());   //문서 개수
			int M = Integer.parseInt(st.nextToken());   //궁금한 인덱스
			
			LinkedList<int[]> q = new LinkedList<>();	// Queue
			st = new StringTokenizer(br.readLine());
 
			for (int i = 0; i < N; i++) {
				q.offer(new int[] { i, Integer.parseInt(st.nextToken()) }); // {인덱스, 중요도}
			}
 
			int count = 1;	// 출력 횟수
			
			while (!q.isEmpty()) {	

                // 가장 큰 중요도의 위치 찾기
				int max = 0;
				for(int i = 0; i < q.size(); i++) {
					if(q.get(max)[1] < q.get(i)[1]) {
                        max = i;
					}
				}
				
                //가장 큰 중요도 가진 문서 앞의 문서들 뒤로 다 보내
                for(int j = 0; j < max; j++) {
                    q.offer(q.poll());
                }
            
                // 찾고자 하는 문서라면 해당 테스트케이스 종료
				if(q.get(0)[0] == M) {
					break;
				}

                //찾는 문서가 아니라면
                q.poll(); //큐에서 꺼내고
                count++; //꺼낸 횟수 증가하고 계속
 
			}
 
			sb.append(count).append('\n');
 
		}

		System.out.println(sb);

	}

}
