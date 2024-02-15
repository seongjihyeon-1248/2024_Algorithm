// 첫 번째 풀이
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        if(s.equals("1 2 3 4 5 6 7 8"))
            System.out.print("ascending");
        else if(s.equals("8 7 6 5 4 3 2 1"))
            System.out.print("descending");
        else
            System.out.print("mixed");
    }
}


// 두 번째 풀이
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dct = new int[8];
        boolean ascending = true;
        boolean descending = true;
        String result;

        for(int i = 0; i < 8; i++) {
            dct[i] = sc.nextInt();
        }

        for(int i = 0; i < 8; i++) {
            if(dct[i] != i+1)
                ascending = false;
            if(dct[i] != (8-i))
                descending = false;
        }

        if(ascending)
            result = "ascending";
        else if(descending)
            result = "descending";
        else
            result = "mixed";

        System.out.print(result);
    }
}
