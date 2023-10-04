class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        //0123456789*#
        int[][] d = {{0,1},{3,0},{3,1},{3,2},{2,0},{2,1},{2,2},{1,0},{1,1},{1,2},{0,0},{0,2}};
        int left =10;
        int right =11;
        
        for(int i =0 ; i<numbers.length ;i++){
            int k = numbers[i];
            
            if(k==1 || k==4 || k==7){
                answer +="L";
                left =k;
            }else if(k==3 || k==6 || k==9){
                answer +="R";
                right =k;
            }else{
               int a = Math.abs(d[k][0] - d[left][0]) + Math.abs(d[k][1] - d[left][1]);
               int b = Math.abs(d[k][0] - d[right][0]) + Math.abs(d[k][1] - d[right][1]);
                
               if(a>b){
                   answer +="R";
                   right =k;
               }else if(a==b){                  
                   if(hand.equals("right")){
                       answer +="R";
                       right =k;
                   }else{
                       answer +="L";
                       left =k;
                   }
               }else{
                   answer +="L";
                   left =k;
               }
            }
        }
        
        return answer;
    }
}