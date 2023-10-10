import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        Map<String,Integer> map = new HashMap<String,Integer>();
        
        map.put("R",0);
        map.put("T",0);
        map.put("C",0);
        map.put("F",0);
        map.put("J",0);
        map.put("M",0);
        map.put("A",0);
        map.put("N",0);
        
        for(int i =0 ; i< choices.length ; i++){
            String[] str = survey[i].split("");
            
            switch(choices[i]) {
                case 1 : map.put(str[0],map.get(str[0])+3);
                    break;
                case 2 : map.put(str[0],map.get(str[0])+2);
                    break;
                case 3 : map.put(str[0],map.get(str[0])+1);
                    break;
                case 4 : 
                    break;    
                case 5 : map.put(str[1],map.get(str[1])+1);
                    break; 
                case 6 : map.put(str[1],map.get(str[1])+2);
                    break;
                case 7 : map.put(str[1],map.get(str[1])+3);
                    break;  
                    
            }
                
        }
        
        if(map.getOrDefault("R",0) >= map.getOrDefault("T",0)){
            answer +="R";
        }else {
            answer +="T";
        }
        
        if(map.getOrDefault("C",0) >= map.getOrDefault("F",0)){
            answer +="C";
        }else {
            answer +="F";
        }
        
        if(map.getOrDefault("J",0) >= map.getOrDefault("M",0)){
            answer +="J";
        }else {
            answer +="M";
        }
        
        if(map.getOrDefault("A",0) >= map.getOrDefault("N",0)){
            answer +="A";
        }else {
            answer +="N";
        }
        
        return answer;
    }
}