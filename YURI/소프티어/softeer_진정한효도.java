import java.util.*;
import java.io.*;

public class Main {

    static int[][] ground;
    static int first;
    static int second;
    static int third;
    static int min = 4;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ground = new int[3][3];
        int result = 0;

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                ground[i][j] = sc.nextInt();
            }
        }

        // 가로줄 반복
        for(int i = 0; i < 3; i++) {
            first = ground[i][0];
            second = ground[i][1];
            third = ground[i][2];
            result = compare();
            if(result == 0) {
                min = 0;
                break;
            }
            else if(result < min)
                min = result;
        }

        // 세로줄 반복
        for(int i = 0; i < 3; i++) {
            first = ground[0][i];
            second = ground[1][i];
            third = ground[2][i];
            result = compare();
            if(result == 0) {
                min = 0;
                break;
            }
            else if(result < min)
                min = result;
        }

        System.out.print(min);
    }

    public static int compare() {
        int result;
        if(first == second && second == third)
            result = 0;
        else if(first != second && first != third && second != third)
            result = 2;
        else if(first != second)
            result = Math.abs(first - second);
        else
            result = Math.abs(first - third);
        return result;
    }
}

