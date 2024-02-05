//https://school.programmers.co.kr/learn/courses/30/lessons/181914
package JIHYEON.Programmers_0;

public class programmers_소문자로_바꾸기 {
    public static void main(String[] args) {
        System.out.println(new Solution_소문자로_바꾸기().solution("aBcDeFg"));
    }
}

class Solution_소문자로_바꾸기 {
    public String solution(String myString) {
        // 문자열, 문자를 소문자로 바꿀때는 toLowerCase메소드 (opp:toUpperCase)
        return myString.toLowerCase();
    }
}