import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int result = 0;

        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < tangerine.length; i++) {
            countMap.put(tangerine[i], countMap.getOrDefault(tangerine[i], 0) + 1);
        }
        
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(countMap.entrySet());


        entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));


        for (Map.Entry<Integer, Integer> entry : entryList) {
            
            if ( k <= 0 ) break;            
            result++;          
            k -= entry.getValue();           
        }

        return result;
    }
}