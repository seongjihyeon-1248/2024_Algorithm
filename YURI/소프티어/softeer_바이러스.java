import java.math.BigInteger;
import java.util.*;

public class Main {

    static long K;
    static long P;
    static int N;
    static BigInteger result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        K = sc.nextInt();
        P = sc.nextInt();
        N = sc.nextInt();

        result = BigInteger.valueOf(K).multiply(BigInteger.valueOf(P).modPow(BigInteger.valueOf(N), BigInteger.valueOf(1000000007)));

        System.out.print(result.mod(new BigInteger("1000000007")));
    }
}
