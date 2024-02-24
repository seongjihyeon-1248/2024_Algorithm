import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String formula = sc.next();
        Stack<Double> stack = new Stack<>();
        double[] nums = new double[N];

        for(int i = 0; i < N; i++)
            nums[i] = sc.nextDouble();

        for(int i = 0; i < formula.length(); i++) {
            char c = formula.charAt(i);
            if(c >= 'A' && c <= 'Z')
                stack.push(nums[c-'A']);
            else {
                double back = stack.pop();
                double front = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(front + back);
                        break;
                    case '-':
                        stack.push(front - back);
                        break;
                    case '*':
                        stack.push(front * back);
                        break;
                    case '/':
                        stack.add(front / back);
                        break;
                }
            }
        }

        System.out.printf("%.2f", stack.pop());

    }
}
