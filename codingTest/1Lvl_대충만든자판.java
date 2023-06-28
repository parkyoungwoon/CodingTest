import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        //횟수 제출
        int[] answer = new int[targets.length];
        
        //맵에 자판 횟수별 최소값을 담음
        Map<String, Integer> map = new HashMap();
        for(int i = 0; i < keymap.length; i++){
            char[] keymapS = keymap[i].toCharArray();
            for(int j = 0; j < keymapS.length; j++){
                if(map.get(Character.toString(keymapS[j])) != null){
                   if(map.get(Character.toString(keymapS[j]))>j){
                        map.put(Character.toString(keymapS[j]),j+1);
                   }
                }else{
                   map.put(Character.toString(keymapS[j]),j+1);
                }
            }
        }
        
        //최소값이 담긴 map 에서 해당 값을 찾아서 더함, 없을 경우 -1 을 넣고 break 걸음
        for(int i = 0; i < targets.length; i++){
            for(int j = 0; j < targets[i].length(); j++){
                char[] targetsS = targets[i].toCharArray();
                if(map.get(Character.toString(targetsS[j])) == null){
                    answer[i] = -1;
                    break;
                }else{
                    answer[i] = answer[i] +map.get(Character.toString(targetsS[j]));
                }
            }
        }
        
        
        
        return answer;
    }
}