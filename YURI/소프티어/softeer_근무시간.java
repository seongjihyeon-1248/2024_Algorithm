import java.util.*;
import java.io.*;

public class Main {

    static int start;
    static int end;
    static String[] timeSplit;
    static int result;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            timeSplit = sc.next().split(":");
            start = Integer.parseInt(timeSplit[0]) * 60 + Integer.parseInt(timeSplit[1]);
            timeSplit = sc.next().split(":");
            end = Integer.parseInt(timeSplit[0]) * 60 + Integer.parseInt(timeSplit[1]);
            result += end - start;
        }

        System.out.print(result);

    }

}

