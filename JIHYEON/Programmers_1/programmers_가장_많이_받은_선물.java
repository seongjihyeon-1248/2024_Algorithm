package JIHYEON.Programmers_1;

import java.util.ArrayList;

public class programmers_가장_많이_받은_선물 {
    
    public static void main(String args[]){
        System.out.println(new Solution_가장_많이_받은_선물().solution(new String[]{"muzi", "ryan", "frodo", "neo"}, new String[]{"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"}));
    }
}

class Solution_가장_많이_받은_선물 {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;

        ArrayList<String> array_friend = new ArrayList<>();
        for(String f: friends){
            array_friend.add(f);
        }

        int[][] gift = new int[friends.length][friends.length]; //주고 받은 선물
        int[] gift_num = new int[friends.length]; // 선물 지수
        int[] gift_next = new int[friends.length]; // 다음달 선물
        for(int i = 0; i < friends.length; i++){
            for(int ii = 0; ii < friends.length; ii++){
                gift[i][ii] = 0;
            }
            gift_num[i] = 0;
            gift_next[i] = 0;
        }

        for(String g: gifts){
            String[] g_part = g.split(" ");
            gift[array_friend.indexOf(g_part[0])][array_friend.indexOf(g_part[1])] += 1;
            gift_num[array_friend.indexOf(g_part[0])] += 1;
            gift_num[array_friend.indexOf(g_part[1])] -= 1;
        }

        for(int i = 0; i <friends.length; i++){
            for(int ii = i + 1; ii < friends.length; ii++){
                if(gift[i][ii] > gift[ii][i]){
                    gift_next[i]++;
                }
                else if(gift[i][ii] < gift[ii][i]){
                    gift_next[ii]++;
                }
                else{
                    if(gift_num[i] > gift_num[ii]) gift_next[i]++;
                    else if(gift_num[i] < gift_num[ii]) gift_next[ii]++;
                }
            }
        }

        for(int i = 0; i < friends.length; i++){
            if(answer < gift_next[i]) answer = gift_next[i];
        }
        return answer;
    }
}
