//https://school.programmers.co.kr/learn/courses/30/lessons/120903
package JIHYEON.Programmers_0;


public class programmers_배열의_유사도 {
	public static void main(String[] args) {
        System.out.println(new Solution_배열의_유사도().solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"}));
    }
}

class Solution_배열의_유사도{
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String s_1 : s1){
            for(String s_2 : s2){
                if(s_1.equals(s_2)) answer++;
            }
        }
        return answer;
    }
}