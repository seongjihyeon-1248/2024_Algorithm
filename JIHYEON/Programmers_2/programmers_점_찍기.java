//https://school.programmers.co.kr/learn/courses/30/lessons/140107

public class programmers_점_찍기 {
    public static void main(String args[]){
        System.out.println(new Solution_점_찍기().solution(1,1000000));
    }
} 
 
class Solution_점_찍기 {
    public long solution(int k, int d) {
        long answer = d / k + 1;

        for(long x = 0; x <= d; x += k){
            answer += (long) Math.sqrt((long) d*d -  x*x) / k;
        }
        
        return answer;
    }
}