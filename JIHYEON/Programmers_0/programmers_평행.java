//https://school.programmers.co.kr/learn/courses/30/lessons/120875

package JIHYEON.Programmers_0;

public class programmers_평행 {
    public static void main(String[] args) {
        System.out.println(new Solution_평행().solution(new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}}));
    }
}

class Solution_평행{
    public int solution(int[][] dots) {
        if((dots[0][1] - dots[1][1]) * (dots[2][0] - dots[3][0]) == (dots[2][1] - dots[3][1]) * (dots[0][0] - dots[1][0])) return 1;
        else if((dots[0][1] - dots[2][1]) * (dots[1][0] - dots[3][0]) == (dots[1][1] - dots[3][1]) * (dots[0][0] - dots[2][0])) return 1;
        else if((dots[0][1] - dots[3][1]) * (dots[1][0] - dots[2][0]) == (dots[1][1] - dots[2][1]) * (dots[0][0] - dots[3][0])) return 1;
        return 0;
    }
}