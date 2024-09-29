//https://school.programmers.co.kr/learn/courses/30/lessons/135807?language=java

import java.util.Arrays;

public class programmers_숫자_카드_나누기 {
    public static void main(String args[]){
        System.out.println(new Solution_숫자_카드_나누기().solution(new int[]{10, 20}, new int[]{5, 17}));
    }
} 

class Solution_숫자_카드_나누기 {
    public int solution(int[] arrayA, int[] arrayB) {
        int a_min = Arrays.stream(arrayA).min().getAsInt();
        int a_max = 0;
        int b_min = Arrays.stream(arrayB).min().getAsInt();
        int b_max = 0;
        for(int i = 1; i <= (int)Math.sqrt(a_min); i++){
            if(a_min % i == 0){
                int ii = a_min / i;
                int n = 0;
                for(int a: arrayA){
                    if(a % ii != 0){
                        break;
                    }
                    else{
                        n++;
                    }
                }
                if(n == arrayA.length){
                    int m = 0;
                    for(int b: arrayB){
                        if(b % ii == 0){
                            break;
                        }
                        else{
                            m++;
                        }
                    }
                    if(m == arrayB.length){
                        a_max = ii;
                        break;
                    }
                }
            }
        }
        if(a_max == 0){
            for(int i = (int)Math.sqrt(a_min); i > 0; i--){
                int n = 0;
                for(int a: arrayA){
                    if(a % i != 0){
                        break;
                    }
                    else{
                        n++;
                    }
                }
                if(n == arrayA.length){
                    int m = 0;
                    for(int b: arrayB){
                        if(b % i == 0){
                            break;
                        }
                        else{
                            m++;
                        }
                    }
                    if(m == arrayB.length){
                        a_max = i;
                        break;
                    }
                } 
            }
        }
        
        for(int i = 1; i <= (int)Math.sqrt(b_min); i++){
            if(b_min % i == 0){
                int ii = b_min / i;
                int n = 0;
                for(int b: arrayB){
                    if(b % ii != 0){
                        break;
                    }
                    else{
                        n++;
                    }
                }
                if(n == arrayB.length){
                    int m = 0;
                    for(int a: arrayA){
                        if(a % ii == 0){
                            break;
                        }
                        else{
                            m++;
                        }
                    }
                    if(m == arrayA.length){
                        b_max = ii;
                        break;
                    }
                }
            }
        }
        if(b_max == 0){
            for(int i = (int)Math.sqrt(b_min); i > 0; i--){
                int n = 0;
                for(int b: arrayB){
                    if(b % i != 0){
                        break;
                    }
                    else{
                        n++;
                    }
                }
                if(n == arrayB.length){
                    int m = 0;
                    for(int a: arrayA){
                        if(a % i == 0){
                            break;
                        }
                        else{
                            m++;
                        }
                    }
                    if(m == arrayA.length){
                        b_max = i;
                        break;
                    }
                } 
            }
        }
        return Math.max(a_max, b_max);
    }
}