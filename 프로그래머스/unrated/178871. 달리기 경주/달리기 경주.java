import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playerMap =new HashMap<>();
        for(int i = 0 ;i<players.length;i++){
            playerMap.put(players[i],(i+1));
        }
        for(int i = 0 ; i <callings.length;i++){
            String temp ="";
            temp =players[playerMap.get(callings[i])-2];
             players[playerMap.get(callings[i])-2] = players[playerMap.get(callings[i])-1];
			 players[playerMap.get(callings[i])-1] = temp;
			 playerMap.put(callings[i], playerMap.get(callings[i])-1);
			 playerMap.put(temp, playerMap.get(temp)+1);
	 
		}
		return players;
	}
}