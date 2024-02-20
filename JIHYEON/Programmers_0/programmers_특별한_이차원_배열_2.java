//https://school.programmers.co.kr/learn/courses/30/lessons/181831
package JIHYEON.Programmers_0;

public class programmers_특별한_이차원_배열_2 {
    public static void main(String[] args) {
        System.out.println(new Solution_특별한_이차원_배열_2().solution(new int[][]{{5, 192, 33}, {192, 72, 95}, {33, 95, 999}}));
    }
}

class Solution_특별한_이차원_배열_2{
    public int solution(int[][] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int ii = i + 1; ii < arr.length; ii++){
                if(arr[i][ii] != arr[ii][i]) return 0;
            }
        }
        return 1;
    }
}
