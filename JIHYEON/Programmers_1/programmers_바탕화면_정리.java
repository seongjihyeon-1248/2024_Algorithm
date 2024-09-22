package JIHYEON.Programmers_1;

public class programmers_바탕화면_정리 {
    public static void main(String args[]){
        System.out.println(new Solution_바탕화면_정리().solution(new String[]{".#...", "..#..", "...#."}));
    }
}

class Solution_바탕화면_정리{
    public int[] solution(String[] wallpaper) {
        int lux = Integer.MAX_VALUE; //int lux = wallpaper.length;
        int luy = Integer.MAX_VALUE; //int luy = wallpaper[0].length();
        int rdx = Integer.MIN_VALUE; //int rdx = 0;
        int rdy = Integer.MIN_VALUE; //int rdy = 0;
        for(int i = 0; i < wallpaper.length; i++){
            int x = 0;
            for(int ii = 0; ii < wallpaper[0].length(); ii++){
                if(wallpaper[i].charAt(ii) == '#'){
                    x = 1;
                    if(ii < luy) luy = ii;
                    if(rdy < ii) rdy = ii;
                }
            }
            if(x == 1){
                if(i < lux) lux = i;
                if(rdx < i) rdx = i;
            }
        }
        return new int[]{lux, luy, rdx + 1, rdy + 1};
    }
}