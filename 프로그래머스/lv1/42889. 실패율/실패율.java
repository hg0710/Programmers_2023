import java.util.*;
class Solution {
    public List<Integer> solution(int N, int[] stages) {
        
        int[] fail = new int[N];
        
        for(int i =0 ; i< stages.length ;i++){
            if(stages[i] <= N){
                fail[stages[i]-1]++;   
            }    
        }
        
        int person = stages.length;
        Map<Integer, Double> map = new HashMap<Integer, Double>();
        
        for(int j =0 ; j< N ;j++){          
           if (person == 0) {
                map.put(j+1, 0.0); 
            } else {
                map.put(j+1, (double) fail[j] / (double) person);
                person -= fail[j];
            }
        }
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        
        return keySet;
    }
}