//https://school.programmers.co.kr/learn/courses/30/lessons/120846
package JIHYEON.Programmers_0;

import java.util.HashSet;
import java.util.Set;

public class programmers_합성수_찾기 {
    public static void main(String[] args) {
        System.out.println(new Solution_합성수_찾기().solution(200));
    }
}

class Solution_합성수_찾기{
    //에라토스테네스의 체
    public int solution(int n) {
        Set<String> set = new HashSet<>();
        for(int i = 2; i <= Math.sqrt(n); i++){
            for(int ii = i * i; ii <= n; ii += i){
                set.add(""+ii);
            }
        }
        return set.size();
    }
}
