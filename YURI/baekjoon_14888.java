import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N;
    static int[] num;
    static int min = 1000000000;
    static int max = -1000000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        num = new int[N];
        int[] operator = new int[4]; // 연산자 개수 저장

        for(int i = 0; i < N; i++)
            num[i] = sc.nextInt();
        for(int i = 0; i < 4; i++)
            operator[i] = sc.nextInt();

        dfs(1, operator, num[0]);
        System.out.println(max + "\n" + min);

    }

    public static void dfs(int start, int[] operator, int result) {

        // 연산자를 모두 사용한 경우 최대값, 최소값을 비교
        if((operator[0] + operator[1] + operator[2] + operator[3]) == 0) {
            if(max < result) max = result;
            if(min > result) min = result;
            return;
        }

        for(int i  = 0; i < 4; i++) {
            if(operator[i] > 0){
                // 계산을 먼저 함
                int newResult = cal(result, num[start], i);
                int[] newOperator = Arrays.copyOf(operator, operator.length);
                newOperator[i] -= 1;

                // 재귀호출
                dfs(start+1, newOperator, newResult);
            }
        }
    }

    public static int cal(int result, int num, int operator) {
        int newResult = 0;
        switch (operator) {
            case 0:
                newResult = result + num;
                break;
            case 1:
                newResult = result - num;
                break;
            case 2:
                newResult = result * num;
                break;
            case 3:
                newResult = result / num;
                break;
        }
        return newResult;
    }
}
