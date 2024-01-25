import java.util.*;
import java.io.* ;

public class Main {

    static int N;
    static int[] A;
    static int B;
    static int C;
    static long answer;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        A = new int[N];
        answer = N;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        // 계산
        for(int n : A) {
            if(n - B > 0)
                answer += ((n - B) + (C - 1)) / C;
        }

        System.out.println(answer);
    }

}

// 숫자의 크기를 항상 고려할 것.
