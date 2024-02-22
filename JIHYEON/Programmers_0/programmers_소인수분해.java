//https://school.programmers.co.kr/learn/courses/30/lessons/120852
package JIHYEON.Programmers_0;

import java.util.ArrayList;
import java.util.List;

public class programmers_소인수분해{
    public static void main(String[] args) {
        System.out.println(new Solution_소인수분해().solution(12));
    }
}

class Solution_소인수분해 {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i = 2; i <= n; i++){
            if(n % i == 0){
                while(n % i == 0){
                    n /= i;
                }
                list.add(i);
            }
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}