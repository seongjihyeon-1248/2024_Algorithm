//https://school.programmers.co.kr/learn/courses/30/lessons/136798
class programmers_기사단원의_무기{
    public static void main(String args[]){
        System.out.println(new Solution_기사단원의_무기().solution(5,3,2));
    }
}

class Solution_기사단원의_무기 {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int n[] = new int[number + 1];
        for(int i = 1; i < number; i++){
            n[i] = 0;
        }
        n[1] = 1;
        for(int i = 2; i <= number; i++){
            int ii = 1;
            for(; ii < Math.sqrt(i); ii++){
                if(i % ii == 0) n[i] += 2;
            }
            if(i == ii * ii) n[i] += 1;
        }

        for(int i = 1; i <= number ; i++){
            if(n[i] > limit) answer += power;
            else answer += n[i];
        }

        return answer;
    }
}