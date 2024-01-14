//https://www.acmicpc.net/problem/10816

package JIHYEON.Data_Structures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baekjoon10816 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        //Hashmap key에 값, value에 개수 저장
		int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (N-- > 0) {
            String st_next = st.nextToken();
            //해당 값을 Hashmap이 가지고 있지 않으면 key를 해당 값, value를 1로 해 추가 
            if(!map.containsKey(st_next)) {
                map.put(st_next, 1);
            }
            //해당 값을 Hashmap이 가지고 있으면 value에 1을 더해 변경(추가)
            else {
                map.put(st_next, map.get(st_next) + 1);
            }
        }

        //Hashmap에서 탐색
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (M-- > 0) {
            String st_next = st.nextToken();
            //해당 값을 Hashmap이 가지고 있지 않으면 '0'를 출력문자열에 추가 
            if(!map.containsKey(st_next)) {
                sb.append("0 ");
            }
            //해당 값을 Hashmap이 가지고 있으면 value(갯수)를 출력문자열에 추가
            else {
                sb.append(map.get(st_next)).append(" ");
            }
        }

        System.out.print(sb);
        br.close();
    }
}