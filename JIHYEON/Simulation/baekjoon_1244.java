//https://www.acmicpc.net/problem/1244

package JIHYEON.Simulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
import java.util.StringTokenizer;
 
public class baekjoon_1244 {
    static int[] s_main;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

        //스위치 상태 초기화
        int s_num = Integer.parseInt(br.readLine()) + 1;
        s_main = new int[s_num];
        StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i < s_num; i++){
            s_main[i] = Integer.parseInt(st.nextToken());
        }

        int students =  Integer.parseInt(br.readLine());

		while (students-- > 0) {
			
			st = new StringTokenizer(br.readLine());
			int gender = Integer.parseInt(st.nextToken());   
			int num = Integer.parseInt(st.nextToken());  

            //남자일 경우 num의 배수들 바꿈
            if(gender == 1){
                for(int i = num; i < s_num; i += num){
                    invert(i);
                }
            }
            //여자일 경우 num부터 대칭으로 같은 수들 바꿈
            else{
                invert(num);
                int diff = 1;
                while(num - diff > 0 && num + diff < s_num){
                    if(s_main[num - diff] == s_main[num + diff]){
                        invert(num - diff);
                        invert(num + diff);
                        diff++;
                    }
                    else break;
                }
            }
 
		}

        //한 줄당 20개씩 출력
        for(int i = 1; i < s_num; i++){
            if(i % 20 == 0) sb.append(s_main[i]).append("\n");
            else sb.append(s_main[i]).append(" ");
        }
		System.out.println(sb);

	}
    public static void invert(int n){
        if(s_main[n] == 0) s_main[n] = 1;
        else s_main[n] = 0;
    }

}
