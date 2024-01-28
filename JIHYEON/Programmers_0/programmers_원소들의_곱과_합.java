//https://school.programmers.co.kr/learn/courses/30/lessons/181929
package JIHYEON.Programmers_0;

public class programmers_원소들의_곱과_합 {
    public static void main(String[] args) {
        System.out.println(new Solution_원소들의_곱과_합().solution(new int[]{3, 4, 5, 2, 1}));
    }
}

class Solution_원소들의_곱과_합{
    public int solution(int[] num_list) {
        //스트림이 더 비효율적이었음
        int multi = 1;
        int sum = 0;
        for(int n: num_list){
            multi *= n;
            sum += n;
        }
        if(multi < sum * sum) return 1;
        else return 0;
    }
}