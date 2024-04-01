//https://school.programmers.co.kr/learn/courses/30/lessons/92334
package JIHYEON.Programmers_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class programmers_신고_결과_받기 {
    public static void main(String[] args) {
        System.out.println(new Solution_신고_결과_받기().solution(new String[]{"con", "ryan"}, new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}, 3));
    }
}

class Solution_신고_결과_받기{

    public int[] solution(String[] id_list, String[] report, int k) {

        //신고 받은 수 배열 생성
        HashMap<String, Integer> score = new HashMap<>();
        for(String id: id_list){
            score.put(id, 0);
        }

        //신고 받은 수 배열 정리
        String[] rep = Arrays.stream(report).distinct().toArray(String[]::new);
        for(String r: rep){
            StringTokenizer st = new StringTokenizer(r);
            st.nextToken();
            String id = st.nextToken();
            score.put(id, score.get(id) + 1);
        }

        //정지 시킨
        HashMap<String, Integer> ans = new HashMap<>();
        for(String id: id_list){
            ans.put(id, 0);
        }
        for(String r: rep){
            StringTokenizer st = new StringTokenizer(r);
            String a = st.nextToken();
            if(score.get(st.nextToken()) >= k)
                ans.put(a, ans.get(a) + 1);
        }

        int[] answer = new int[id_list.length];
        for(int i = 0; i < id_list.length; i++){
            answer[i] = ans.get(id_list[i]);
        }
        return answer;
    }
}
