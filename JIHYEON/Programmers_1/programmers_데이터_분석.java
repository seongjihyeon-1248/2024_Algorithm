//https://school.programmers.co.kr/learn/courses/30/lessons/67256
package JIHYEON.Programmers_1;

import java.util.ArrayList;
import java.util.Arrays;

public class programmers_데이터_분석 {
    public static void main(String[] args) {
        System.out.println(new Solution_데이터_분석().solution(new int[][]{{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}}, "date", 20300501, "remain"));
    }
}

class Solution_데이터_분석 {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        //정렬
        if(sort_by.equals("code")){
            Arrays.sort(data, (o1, o2) -> {
                return o1[0]-o2[0]; 
            });
        }
        else if(sort_by.equals("date")){
            Arrays.sort(data, (o1, o2) -> {
                return o1[1]-o2[1]; 
            });
        }
        else if(sort_by.equals("maximum")){
            Arrays.sort(data, (o1, o2) -> {
                return o1[2]-o2[2]; 
            });
        }
        else{
            Arrays.sort(data, (o1, o2) -> {
                return o1[3]-o2[3]; 
            });
        }

        ArrayList<Integer> an = new ArrayList<>();
        
        //조건
        if(ext.equals("code")){
            for(int i = 0; i < data.length; i++){
                if(data[i][0] < val_ext){
                    an.add(i);
                }
            }
        }
        else if(ext.equals("date")){
            for(int i = 0; i < data.length; i++){
                if(data[i][1] < val_ext){
                    an.add(i);
                }
            }
        }
        else if(ext.equals("maximum")){
            for(int i = 0; i < data.length; i++){
                if(data[i][2] < val_ext){
                    an.add(i);
                }
            }
        }
        else{
            for(int i = 0; i < data.length; i++){
                if(data[i][3] < val_ext){
                    an.add(i);
                }
            }
        }

        int[][] answer = new int[an.size()][4];

        //배열로 옮기기
        for(int i = 0; i < an.size(); i++){
            answer[i] = data[an.get(i)];
        }

        return answer;
    }
}