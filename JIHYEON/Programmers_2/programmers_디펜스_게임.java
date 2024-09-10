//https://school.programmers.co.kr/learn/courses/30/lessons/142085

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class programmers_디펜스_게임 {
    public static void main(String args[]){
        System.out.println(new Solution_디펜스_게임().solution(7, 3, new int[]{4, 2, 4, 5, 3, 3, 1}));
    }
} 

class Solution_디펜스_게임 {
    public int solution(int n, int k, int[] enemy) {
        int answer = enemy.length;
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < enemy.length; i++) {
            n -= enemy[i];
            pq.add(enemy[i]);

            if (n < 0) {
                if (k > 0 && !pq.isEmpty()) {
                    n += pq.poll();
                    k--;
                } else {
                    return i;
                }
            }
        }

        return answer;
    }
}