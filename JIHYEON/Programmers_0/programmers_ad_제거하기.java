//https://school.programmers.co.kr/learn/courses/30/lessons/181870

package JIHYEON.Programmers_0;

import java.util.ArrayList;

public class programmers_ad_제거하기 {
    public static void main(String args[]){
        System.out.println(new Solution_ad_제거하기().solution(new String[]{"and","notad","abcd"}));
    }
}

class Solution_ad_제거하기{
    public ArrayList<String> solution(String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();
        for(String str: strArr){
            if(!str.contains("ad")) answer.add(str);
        }
        return answer;
    }
}