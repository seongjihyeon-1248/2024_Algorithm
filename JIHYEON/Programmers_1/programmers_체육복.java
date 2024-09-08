//https://school.programmers.co.kr/learn/courses/30/lessons/42862

class programmers_체육복{
    public static void main(String args[]){
        System.out.println(new Solution_체육복().solution(5, new int[]{2,4}, new int[]{1,3,5}));
    }
}

class Solution_체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] students = new int[n + 1];
        for(int i = 1; i <= n; i++){
            students[i] = 1;
        }
        for(int i: lost){
            students[i] = 0;
        }
        for(int i: reserve){
            students[i] += 1;
        }
        if(students[1] == 2 && students[2] == 0){
            students[1] = 1;
            students[2] = 1;
        }
        for(int i = 2; i < n; i++){
            if(students[i] == 2){
                if(students[i - 1] == 0){
                    students[i - 1] = 1;
                }
                else if(students[i + 1] == 0){
                    students[i + 1] = 1;
                }
            }
        }
        if(students[n] == 2 && students[n - 1] == 0){
            students[n] = 1;
            students[n - 1] = 1;
        }
        for(int i = 1; i <= n; i++){
            if(students[i] > 0) answer++;
        }
        return answer;
    }
}