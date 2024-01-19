//https://school.programmers.co.kr/learn/courses/30/lessons/181888
package JIHYEON.Programmers_0;

public class programmers_n개_간격의_원소들 {
	public static void main(String[] args) {
        System.out.println(new Solution_n개_간격의_원소들().solution(new int[]{4, 2, 6, 1, 7, 6}, 2));
    }
}

class Solution_n개_간격의_원소들{
    public int[] solution(int[] num_list, int n) {
        int ans_len = (num_list.length - 1) / n + 1;
        int[] answer = new int[ans_len];
        for(int i = 0; i < ans_len; i++){
            answer[i] = num_list[i * n];
        }
        return answer;
    }
}