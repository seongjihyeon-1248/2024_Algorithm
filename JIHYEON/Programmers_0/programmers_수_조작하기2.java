//https://school.programmers.co.kr/learn/courses/30/lessons/181925
package JIHYEON.Programmers_0;

public class programmers_수_조작하기2 {
    public static void main(String[] args) {
        System.out.println(new Solution_수_조작하기2().solution(new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1}));
    }
}

class Solution_수_조작하기2 {
    // StringBuilder를 사용하는 것이 String을 사용하는 것보다 약 10배 효과적임
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        for(int i = 1; i < numLog.length; i++){
            switch (numLog[i] - numLog[i - 1]) {
                case 1:
                    answer.append("w");
                    break;
            
                case -1:
                    answer.append("s");
                    break;

                case 10:
                    answer.append("d");
                    break;
                
                case -10:
                    answer.append("a");
                    break;
                
                default:
                    break;
            }

        }
        return answer.toString();
    }
}
