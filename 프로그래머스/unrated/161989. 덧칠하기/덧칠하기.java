class Solution {
    public int solution(int n, int m, int[] section) {
        
        int i =section[0] + m -1;
        int j =0;
        int answer = 0;
        
        
        while(j < section.length){
            
            if(section[j] > i){
                answer++;
                i = section[j] + m -1;
            }
            
            j++;
        }
        
        return answer+1;
    }
}