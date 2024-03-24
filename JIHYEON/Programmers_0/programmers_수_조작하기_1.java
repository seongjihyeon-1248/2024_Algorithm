//https://school.programmers.co.kr/learn/courses/30/lessons/181926
package JIHYEON.Programmers_0;

public class programmers_수_조작하기_1 {
    public static void main(String[] args) {
        System.out.println(new Solution_수_조작하기().solution(0, "wsdawsdassw"));
    }
}

class Solution_수_조작하기{
    public int solution(int n, String control) {
        for(char c: control.toCharArray()){
            switch (c) {
                case 'w':
                    n += 1;
                    break;
            
                case 's':
                    n -= 1;
                    break;

                case 'd':
                    n += 10;
                    break;
                
                case 'a':
                    n -= 10;
                    break;
                
                default:
                    break;
            }

        }
        return n;
    }
}