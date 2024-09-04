package JIHYEON.Programmers_1;

public class programmers_옹알이_2 {
    public static void main(String[] args) {
        System.out.println(new Solution_옹알이_2().solution(new String[]{"aya", "yee", "u", "maa"}));
    }
}

class Solution_옹알이_2 {
    public int solution(String[] babbling) {
        int answer = 0; 
        
        for(String bab: babbling){
            // 연속발음될 경우 예외처리 
            if(bab.contains("ayaaya") 
               || bab.contains("yeye") 
               || bab.contains("woowoo")
               || bab.contains("mama")){
                continue;
            }
            
            bab = bab.replace("aya", " ");
            bab = bab.replace("ye", " ");
            bab = bab.replace("woo", " ");
            bab = bab.replace("ma", " ");
            //""로 바로 대체하면 안되는 이유
            //예시) mayaa같은 경우 발음이 안되는 단어이지만
            //알고리즘 상, aya가 ""으로 대체되면 ma만 남아 ma또한 ""로 대체되어 
            //발음할 수 있다고 판단되기에 " "로 교체하여 m a로 저장하는 것
            bab = bab.replace(" ", "");

            if(bab.length() == 0) answer++;
        }
        
        return answer;
    }
}