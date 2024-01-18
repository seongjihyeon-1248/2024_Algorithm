//https://school.programmers.co.kr/learn/courses/30/lessons/181848
package JIHYEON.Programmers_0;


public class programmers_문자열을_정수로_변환하기 {
	public static void main(String[] args) {
        System.out.println(new Solution_문자열을_정수로_변환하기().solution("10"));
    }
}

class Solution_문자열을_정수로_변환하기{
    public int solution(String n_str) {
        //문자열 정수로 변환
        int answer = Integer.parseInt(n_str);
        return answer;
    }
}