import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Set<Integer> set = new HashSet<>();
        
        for(int n : nums) {
            set.add(n);
        }
        
        if(nums.length == 0)
            answer = 0;
        else if((nums.length/2) > set.size())
            answer = set.size();
        else
            answer = nums.length/2;
        
        return answer;
    }
}
