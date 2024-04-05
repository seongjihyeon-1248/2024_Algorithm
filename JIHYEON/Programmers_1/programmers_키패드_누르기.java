//https://school.programmers.co.kr/learn/courses/30/lessons/67256
package JIHYEON.Programmers_1;

public class programmers_키패드_누르기 {
    public static void main(String[] args) {
        System.out.println(new Solution_키패드_누르기().solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));
    }
}

class Solution_키패드_누르기{
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int l = 9; 
        int r = 11;
        for(int n: numbers){
            n -= 1;
            if(n % 3 == 0){
                sb.append("L");
                l = n;
            }
            else if(n % 3 == 2){
                sb.append("R");
                r = n;
            }
            else{
                if(n == -1) n = 10;
                int left_diff = Math.abs(l % 3 - n % 3) + Math.abs(l / 3 - n / 3);
                int right_diff = Math.abs(r % 3 - n % 3) + Math.abs(r / 3 - n / 3);
                if(left_diff < right_diff){
                    sb.append("L");
                    l = n;
                }
                else if(left_diff > right_diff){
                    sb.append("R");
                    r = n;
                }
                else{
                    if(hand.equals("left")){
                        sb.append("L");
                        l = n;
                    }
                    else{
                        sb.append("R");
                        r = n;
                    }
                }
            }
        }
        return sb + "";
    }
}