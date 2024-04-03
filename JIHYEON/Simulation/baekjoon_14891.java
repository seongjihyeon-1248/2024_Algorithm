//https://www.acmicpc.net/problem/14503

package JIHYEON.Simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class baekjoon_14891 {
    static String[][] gear;
    static int[] right;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        gear = new String[4][8];
        gear[0] = br.readLine().split("");
        gear[1] = br.readLine().split("");
        gear[2] = br.readLine().split("");
        gear[3] = br.readLine().split("");
        right = new int[]{2,2,2,2};
        int k = Integer.parseInt(br.readLine());
        for(int i = 0; i < k; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken()) - 1;
            int d = Integer.parseInt(st.nextToken());
            spin_minus(num, d);
            right[num] = (right[num] + d + 8) % 8;
            spin_plus(num, d);
        }
        int score = 0;
        if(gear[0][(right[0] + 6) % 8].equals("1")){
            score += 1;
        }
        if(gear[1][(right[1] + 6) % 8].equals("1")){
            score += 2;
        }
        if(gear[2][(right[2] + 6) % 8].equals("1")){
            score += 4;
        }
        if(gear[3][(right[3] + 6) % 8].equals("1")){
            score += 8;
        }
        System.out.println(score);
    }
   public static void spin_minus(int num, int d){
        if(num - 1 >= 0){
            if (!gear[num - 1][right[num - 1]].equals(gear[num][(right[num] + 4) % 8])){
                spin_minus(num - 1, 0 - d);
            }
        }
        right[num] = (right[num] - d + 8) % 8;
    }
    public static void spin_plus(int num, int d){
        if( num + 1 < 4){
            if (!gear[num][right[num]].equals(gear[num + 1][(right[num + 1] + 4) % 8])){
                spin_plus(num + 1, 0 - d);
            }
        }
        right[num] = (right[num] - d + 8) % 8;
    }
}