//https://school.programmers.co.kr/learn/courses/30/lessons/181914
package JIHYEON.Programmers_0;

public class programmers_9로_나눈_나머지 {
    public static void main(String[] args) {
        System.out.println(new Solution_9로_나눈_나머지().solution("123"));
    }
}

class Solution_9로_나눈_나머지{
    public int solution(String number) {
        //문자열에서 각 문자를 숫자로 변환하고 그 숫자들의 합계 계산
        int answer = (number.chars().map(Character::getNumericValue).sum()) % 9;
        return answer;
    }
}
