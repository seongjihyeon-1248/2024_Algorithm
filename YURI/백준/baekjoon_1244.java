import java.util.*;

public class Main {
    static int N;
    static int[] state;
    static int students;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        state = new int[N+1];

        for(int i = 1; i <= N; i++) {
            state[i] = sc.nextInt();
        }

        students = sc.nextInt();

        for(int i = 0; i < students; i++) {
            int gender = sc.nextInt();
            if(gender == 1)
                boy(sc.nextInt());
            else
                girl(sc.nextInt());
        }

        for(int i = 1; i <= N; i++) {
            System.out.print(state[i] + " ");
            if(i%20==0)
                System.out.print("\n");
        }

    }

    public static void boy(int point) {
        for(int i = point; i <= N; i+=point) {
            state[i] = 1 - state[i];
        }
    }

    public static void girl(int point) {
        state[point] = 1 - state[point];

        int left = point-1;
        int right = point+1;

        while (left >= 1 && right <= N && state[left] == state[right]) {
            state[left] = 1 - state[left];
            state[right] = 1 - state[right];
            left -= 1;
            right += 1;
        }
    }
}
