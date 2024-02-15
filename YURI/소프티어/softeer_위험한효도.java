import java.util.*;
import java.io.*;

public class Main {

    static int a;
    static int b;
    static int d;
    static int result = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        d = sc.nextInt();

        forward();
        backward();
        System.out.print(result);

    }

    public static void forward() {
        result += (d / a) * a;
        result += (d / a - 1) * b;
        if(d % a > 0)
            result += (d % a) + b;
    }

    public static void backward() {
        result += (d / b) * b;
        result += (d / b - 1) * a;
        if(d % b > 0)
            result += (d % b) + a;
    }
}

