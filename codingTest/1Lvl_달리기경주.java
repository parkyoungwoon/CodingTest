/*
문제 설명
얀에서는 매년 달리기 경주가 열립니다. 해설진들은 선수들이 자기 바로 앞의 선수를 추월할 때 추월한 선수의 이름을 부릅니다. 예를 들어 1등부터 3등까지 "mumu", "soe", "poe" 선수들이 순서대로 달리고 있을 때, 해설진이 "soe"선수를 불렀다면 2등인 "soe" 선수가 1등인 "mumu" 선수를 추월했다는 것입니다. 즉 "soe" 선수가 1등, "mumu" 선수가 2등으로 바뀝니다.

선수들의 이름이 1등부터 현재 등수 순서대로 담긴 문자열 배열 players와 해설진이 부른 이름을 담은 문자열 배열 callings가 매개변수로 주어질 때, 경주가 끝났을 때 선수들의 이름을 1등부터 등수 순서대로 배열에 담아 return 하는 solution 함수를 완성해주세요.

제한사항
5 ≤ players의 길이 ≤ 50,000
players[i]는 i번째 선수의 이름을 의미합니다.
players의 원소들은 알파벳 소문자로만 이루어져 있습니다.
players에는 중복된 값이 들어가 있지 않습니다.
3 ≤ players[i]의 길이 ≤ 10
2 ≤ callings의 길이 ≤ 1,000,000
callings는 players의 원소들로만 이루어져 있습니다.
경주 진행중 1등인 선수의 이름은 불리지 않습니다.
입출력 예
players	callings	result
["mumu", "soe", "poe", "kai", "mine"]	["kai", "kai", "mine", "mine"]	["mumu", "kai", "mine", "soe", "poe"]
입출력 예 설명
입출력 예 #1

4등인 "kai" 선수가 2번 추월하여 2등이 되고 앞서 3등, 2등인 "poe", "soe" 선수는 4등, 3등이 됩니다. 5등인 "mine" 선수가 2번 추월하여 4등, 3등인 "poe", "soe" 선수가 5등, 4등이 되고 경주가 끝납니다. 1등부터 배열에 담으면 ["mumu", "kai", "mine", "soe", "poe"]이 됩니다.
*/

import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        Map<String, Integer> map1 = new HashMap();
        Map<Integer, String> map2 = new HashMap();
        for(int i = 0; i < players.length; i ++){
            map1.put(players[i],i);
            map2.put(i,players[i]);
        }
        
        for(int i = 0; i < callings.length; i ++){
            //불린 이름의 현재 등수
            int num = (int)map1.get(callings[i]);
            //불린 이름, callings[i]
            
            //불린 이름보다 높은 등수
            int bNum = num-1;
            //불린 이름 보다 높은 등수의 이름
            String bPlayers = map2.get(num-1);
            
            //map1 은 이름이 키, map2 는 등수가 키
            map1.put(callings[i],bNum); 
            map1.put(bPlayers,num);     
            map2.put(bNum,callings[i]);
            map2.put(num,bPlayers);
            
        }
        String[] result = new String[players.length];
        for(int i = 0; i < players.length; i++){
            result[i] = map2.get(i).toString();
        }
        
        
        
        //불린 이름에 따라 반복 함수
        //for(String callingsS:callings){
            /*for(int i = 0; i < players.length; i++){
                if(callingsS.equals(players[i])){
                    //저장된 배열위치와 상위배열 순서 변경
                    players[i] = players[i-1];
                    players[i-1] = callingsS;
                    break;
                }
            }*/
            /*int i = Arrays.asList(players).indexOf(callingsS);
            players[i] = players[i-1];
            players[i-1] = callingsS;*/
            /*int j = IntStream.range(0, players.length)
                    .filter(i -> callingsS.equals(players[i]))
                    .findFirst()
                    .orElse(1);
            //저장된 배열위치와 상위배열 순서 변경
            String checkName_1 = players[j];
            players[j] = players[j-1];
            players[j-1] = checkName_1;*/
        //}    
        
        
        
        
        return result;
    }
}