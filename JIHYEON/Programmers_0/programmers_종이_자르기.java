//https://school.programmers.co.kr/learn/courses/30/lessons/120909

package JIHYEON.Programmers_0;

public class programmers_종이_자르기 {
    public static void main(String[] args) {
        System.out.println(new Solution_종이_자르기().solution(2,2));
    }
}

class Solution_종이_자르기{
    public int solution(int M, int N) {
        return M * N - 1;
    }
}