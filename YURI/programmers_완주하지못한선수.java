import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        // 완주자들을 모두 해시맵에 넣는다. value는 같은 이름의 완주자가 몇 명 있는지를 표시할 수 있도록 한다.
        for(String s : completion) {
            if(!map.containsKey(s)) {
                map.put(s, 1);
            }
            else {
                map.put(s, map.get(s) + 1);
            }
        }
        
        /* 
        해시맵에서 참여자 명단을 활용해 완주를 했는지 찾아본다.
        만약 해시맵에 이미 추가되어있다면 완주자 수를 -1한다.
        해시맵에 없거나 완주자 수가 이미 0이라면, 해당하는 참여자 이름을 return.
        */
        
        for(String s2 : participant) {
            if(map.containsKey(s2)) {
                if(map.get(s2) > 0) {
                    map.put(s2, map.get(s2) - 1);
                    continue;
                }
            }
            answer = s2;
            break;
        }
        
        return answer;
        
    }
}
