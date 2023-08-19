class Solution {
    public int solution(int[][] sizes) {
        int[] sum = new int[]{0,0};
        int temp = 0;
        
        
        for(int i = 0 ; i< sizes.length ; i++){            
           if(sizes[i][0] < sizes[i][1]){
               temp = sizes[i][0];
               sizes[i][0] = sizes[i][1];
               sizes[i][1] = temp;
            }
            
            if(sum[0] < sizes[i][0]) sum[0] = sizes[i][0];
            if(sum[1] < sizes[i][1]) sum[1] = sizes[i][1];
            
        }
        
        
        return sum[0]*sum[1];
    }
}