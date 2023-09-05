class Solution {
    public int solution(int[] nums) {
        int sum = 0;
        int flag =0;
        int answer =0;
        
        for(int i =0 ; i<nums.length ; i++){
            for(int j =i+1 ;j<nums.length ;j++){
                for(int k =j+1 ; k<nums.length ;k++){
                    flag=0;
                    
                    sum = nums[i] + nums[j] + nums[k];

                    for(int x=1 ;x <=sum ;x++){
                        if(sum % x ==0){
                            flag++;               
                        }
                    }
                    if(flag ==2){
                        answer ++;
                    }
                    
                }
            }
        }


        return answer;
    }
}