package JIHYEON.Programmers_1;

public class programmers_핸드폰_번호_가리기 {
    public static void main(String args[]){
        System.out.println(new Solution_핸드폰_번호_가리기().solution("01033334444"));
    }
}

class Solution_핸드폰_번호_가리기 {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        for(int i = 4; i < phone_number.length(); i++){
            answer.append("*");
        }
        answer.append(phone_number.substring(phone_number.length() - 4));
        return answer + "";
    }
}
