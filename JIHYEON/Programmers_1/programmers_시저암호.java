//https://school.programmers.co.kr/learn/courses/30/lessons/12926

class programmers_시저암호{
    public static void main(String args[]){
        System.out.println(new Solution_시저암호().solution("AB", 1));
    }
}

class Solution_시저암호 {
    public String solution(String s, int n) {
        String answer;
        StringBuilder sb = new StringBuilder();
        String big[] = {"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", 
                        "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M"};
        String small[] = {"h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", 
                            "u", "v", "w", "x", "y", "z", "a", "b", "c", "d", "e", "f", "g"};
        for(int i = 0; i < s.length(); i++){
            if('A' <= s.charAt(i) && s.charAt(i) <= 'Z'){
                sb.append(big[(s.charAt(i) + n) % 26]);
            }
            else if('a' <= s.charAt(i) && s.charAt(i) <= 'z'){
                sb.append(small[(s.charAt(i) + n) % 26]);
            }
            else{
                sb.append(s.charAt(i) + "");
            }
        }
        answer = sb.toString();
        return answer;
    }
}