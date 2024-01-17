//https://school.programmers.co.kr/learn/courses/30/lessons/120909

package JIHYEON.Programmers_0;

public class programmers_제곱수_판별하기 {
    public static void main(String[] args) {
        System.out.println(new Solution_제곱수_판별하기().solution(144));
    }
}

class Solution_제곱수_판별하기{
    public int solution(int n) {
        return (Math.sqrt(n) % 1 == 0.0) ? 1 : 2;
    }
}