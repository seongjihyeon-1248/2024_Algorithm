import java.util.*;
import java.io.*;

public class Main {

    static int W;
    static int N;
    static HashMap<Integer, Integer> metal = new HashMap<>();
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        W = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        answer = 0;

        Integer key;
        Integer value;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            value = Integer.parseInt(st.nextToken());
            key = Integer.parseInt(st.nextToken());
            if(metal.containsKey(key))
                value += metal.get(key);
            metal.put(key, value);
        }

        // 가격순으로 정렬
        List<Integer> keyList = new ArrayList<>(metal.keySet());
        keyList.sort(Comparator.reverseOrder());

        int weight;
        // 배낭에 넣기
        for(int n : keyList) {
            weight = metal.get(n);
            if(weight > W) {
                answer += W * n;
                break;
            }
            else {
                answer += weight * n;
                W -= weight;
            }
        }

        System.out.print(answer);

    }

}
