// https://school.programmers.co.kr/learn/courses/30/lessons/147354

import java.util.Arrays;

public class programmers_테이블_해시_함수 {
    public static void main(String args[]){
        System.out.println(new Solution_테이블_해시_함수().solution(new int[][]{{2,2,6},{1,5,10},{4,2,9},{3,8,3}}, 2, 2, 3));
    }
} 
 
class Solution_테이블_해시_함수 {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;

        int Col = col - 1;
        Arrays.sort(data, (o1, o2) -> {
            if (o1[Col] == o2[Col]) return o2[0] - o1[0];
            return o1[Col] - o2[Col];
        });

        for (int i = row_begin - 1; i < row_end; i++) {

            int i_col = i + 1;
            int dataTotal = Arrays.stream(data[i])
                    .map(j -> j % i_col)
                    .sum();

            answer ^= dataTotal;
        }

        return answer;
    }
}