import java.util.*;
class Solution {
    public List<Integer> solution(String[] keymap, String[] targets) {
        List<Integer> answer = new ArrayList<Integer>(); 
            
        for(int i =0 ; i<targets.length ;i++){
            char[] c = targets[i].toCharArray();
            int sum =0;
            
            for(int j =0; j<c.length ;j++){
                int k =0;
                List<Integer> numList = new ArrayList<Integer>();
                while(k<keymap.length){
                    
                    if(keymap[k].contains(String.valueOf(c[j]))){                        
                        numList.add(keymap[k].indexOf(c[j])+1);
                    }                
                    k++;                    
                }
                
                if (numList.isEmpty()) {
                        sum = -1;
                        break;
                    }   
                
                sum += Collections.min(numList); 
            }
            answer.add(sum);
        }
        
        return answer;
    }
}