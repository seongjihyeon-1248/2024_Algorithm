//https://school.programmers.co.kr/learn/courses/30/lessons/82612

public class programmers_부족한_금액_계산하기 {
    public static void main(String args[]){
        System.out.println(new Solution_부족한_금액_계산하기().solution(2000,20,2000));
    }
} 
 
class Solution_부족한_금액_계산하기 {
    public long solution(int price, int money, int count) {
        long answer =  Long.valueOf(price) * count * (count + 1) / 2;
        if(answer < money) return 0;
        return answer - money;
        //return Math.max(price * (count * (count + 1) / 2) - money, 0); 
        //위에처럼 한줄로도 가능 대신 매개변수 타입 바꿔야 함
    }
}