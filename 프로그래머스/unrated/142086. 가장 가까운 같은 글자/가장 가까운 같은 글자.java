import java.util.*;
class Solution {
    public int[] solution(String s) {
        
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        char[] c =s.toCharArray();
        int[] answer = new int[c.length];
        
        for(int i = 0; i < c.length ;i++){
           if(i == s.indexOf(c[i])){
               answer[i] = -1;
               map.put(c[i],i);
           }else{
               if(map.containsKey(c[i])){
                  answer[i] = i - map.get(c[i]);
                  map.remove(c[i]);
                  map.put(c[i],i);
               }
           }
        }
        
        return answer;
    }
}