import java.util.*;

public class Main {

    static int N;
    static int length;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tmp;

        while(sc.hasNext()) {
            N = sc.nextInt();
            length = (int) Math.pow(3, N);
            tmp = "-".repeat(length);
            String result = reflection(tmp);
            System.out.println(result);
        }
    }

    public static String reflection(String s) {
        if(s.length() == 1) {
            return s;
        }

        String first = s.substring(0, s.length()/3);
        String second = s.substring(s.length()/3, 2*s.length()/3);
        String third = s.substring(2*s.length()/3);
        second = second.replace("-", " ");

        first = reflection(first);
        third = reflection(third);

        return first + second + third;

    }

}
