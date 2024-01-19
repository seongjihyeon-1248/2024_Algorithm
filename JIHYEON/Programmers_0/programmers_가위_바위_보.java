//https://school.programmers.co.kr/learn/courses/30/lessons/120839
package JIHYEON.Programmers_0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class programmers_가위_바위_보 {
	public static void main(String[] args) {
        System.out.println(new Solution_가위_바위_보().solution("2"));
    }
}

class Solution_가위_바위_보{
    public String solution(String rsp) {
        //stream 한번 써보기
        return Arrays.stream(rsp.split("")).map(s -> s.equals("2") ? "0" : s.equals("0") ? "5" : "2").collect(Collectors.joining());
    }
}