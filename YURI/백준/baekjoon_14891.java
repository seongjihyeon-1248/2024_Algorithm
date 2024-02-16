import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

    static int K;
    static int num;
    static int dir;

    // 톱니가 맞물린 부분은 1은 2번째, 2, 3은 6, 2 번째, 4는 6번째.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int j = 0; j < 4; j++) {
            ArrayList<Integer> q = new ArrayList<>();
            String st = sc.next();
            for(int i = 0; i < 8; i++){
                q.add(Character.getNumericValue(st.charAt(i)));
            }
            arr.add(q);
        }

        K = sc.nextInt();

        for(int i = 0; i < K; i++) {
            num = sc.nextInt();
            dir = sc.nextInt();
            int tmpDir = dir;

            ArrayList<Integer> standard = arr.get(num-1);
            int stRIndex = standard.get(2);
            int stLIndex = standard.get(6);

            for(int j = num-2; j >= 0; j--) {
                ArrayList<Integer> now = arr.get(j);
                int nowRIndex = now.get(2);
                int nowLIndex = now.get(6);
                if(stLIndex != nowRIndex)
                    rotation(tmpDir * -1, now);
                else
                    break;
                stLIndex = nowLIndex;
                tmpDir *= -1;
            }

            tmpDir = dir;

            for(int j = num; j < 4; j++) {
                ArrayList<Integer> now = arr.get(j);
                int nowRIndex = now.get(2);
                int nowLIndex = now.get(6);
                if(stRIndex != nowLIndex)
                    rotation(tmpDir *-1, now);
                else
                    break;
                stRIndex = nowRIndex;
                tmpDir *= -1;
            }

            rotation(dir, standard);

        }

        int result = 0;
        for(int i = 0; i < 4; i++) {
            if(arr.get(i).get(0) == 1) {
                result += (int) Math.pow(2, i);
            }
        }

        System.out.println(result);
    }

    public static void rotation(int direction, ArrayList<Integer> array) {
        if(direction == 1){
            Integer lastEle = array.remove(array.size() - 1);
            array.add(0, lastEle);
        }
        else {
            Integer firstEle = array.remove(0);
            array.add(firstEle);
        }
    }
}
