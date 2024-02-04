//https://school.programmers.co.kr/learn/courses/30/lessons/181841
package JIHYEON.Programmers_0;

public class programmers_꼬리_문자열 {
    public static void main(String[] args) {
        System.out.println(new Solution_꼬리_문자열().solution(new String[]{"abc", "def", "ghi"}, "ef"));
    }
}

class Solution_꼬리_문자열{
    public String solution(String[] str_list, String ex) {
        StringBuilder sb = new StringBuilder();
        //.contains -> String에 특정 문자열이 있나 확인하는 메소드
        for (String str : str_list) {
            if (!str.contains(ex)) {
                sb.append(str);
            }
        }
        return sb.toString();
    }
}