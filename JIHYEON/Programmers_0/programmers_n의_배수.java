//https://school.programmers.co.kr/learn/courses/30/lessons/181937
package JIHYEON.Programmers_0;

public class programmers_n의_배수 {
	public static void main(String[] args) {
        System.out.println(new Solution_n의_배수().solution(98,2));
    }
}

//삼항연산자 확실하게 외우기.
class Solution_n의_배수{
    public int solution(int num, int n) {
        return num % n == 0 ? 1 : 0 ;
    }
}