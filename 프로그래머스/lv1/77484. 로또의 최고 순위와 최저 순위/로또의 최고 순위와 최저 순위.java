class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        
        for(int i =0 ; i< lottos.length ;i++){
            if(lottos[i]==0){
                answer[0]++;
            }
            
            for(int j =0 ; j<win_nums.length ;j++){
                if(lottos[i]==win_nums[j]){
                    answer[0]++;
                    answer[1]++;
                }
            }
        }
        
        for(int k =0 ;k<answer.length ;k++){
            if(answer[k]==6){
                answer[k]=1;
            }else if(answer[k]==5){
                answer[k]=2;
            }else if(answer[k]==4){
                answer[k]=3;
            }else if(answer[k]==3){
                answer[k]=4;
            }else if(answer[k]==2){
                answer[k]=5;
            }else{
                answer[k]=6;
            }
        }
        
        return answer;
    }
}