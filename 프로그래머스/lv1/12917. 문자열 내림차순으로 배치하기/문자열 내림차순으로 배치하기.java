import java.util.*;
class Solution {
    public String solution(String s) {
        
        Character[] ch = new Character[s.length()];
        
        for (int i = 0; i < s.length(); i++) {         
            ch[i] = s.charAt(i);
        }
        
        Arrays.sort(ch, Collections.reverseOrder());
        
        StringBuilder sb =new StringBuilder(ch.length);
        
        for(Character c : ch){
            sb.append(c);
        }
        
        return sb.toString();
    }
}