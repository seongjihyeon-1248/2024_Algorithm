package JIHYEON.Programmers_0;

public class programmers_짝수는_싫어요 {
    public static void main(String[] args) {
        System.out.println(new Solution_짝수는_싫어요().solution(10));
    }
}

class Solution_짝수는_싫어요{
    public int[] solution(int n) {
    //stream버전은 더 오래걸리지만 적어봄
    //IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
        int[] answer = new int[(n + 1) / 2];
        for(int i = 0; i < (n + 1) / 2; i++){
            answer[i] = 2 * i + 1;
        }
        return answer;
    }
}