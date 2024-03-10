//https://school.programmers.co.kr/learn/courses/30/lessons/120911

package JIHYEON.Programmers_0;

import java.util.Arrays;

public class programmers_문자열_정렬하기_2 {
    public static void main(String[] args) {
        System.out.println(new Solution_문자열_정렬하기_2().solution("Bcad"));
    }
}

class Solution_문자열_정렬하기_2{
    public String solution(String my_string) {
        my_string = my_string.toLowerCase(); 
        
        char[] chArr = my_string.toCharArray();
        Arrays.sort(chArr);
        
        return new String(chArr);
    }
}
