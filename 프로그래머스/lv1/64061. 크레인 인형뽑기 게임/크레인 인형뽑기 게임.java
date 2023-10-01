import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> s = new Stack<Integer>();
        
        for(int i = 0 ; i < moves.length ; i++){
            for(int j =0 ; j < board.length ;j++){
                
                int k = board[j][moves[i]-1];
                
                if(k != 0){
                    
                    
                    
                    if(s.empty()){
                        s.push(k);
                    }else if(s.peek() == k){
                        s.pop();
                        answer+=2;
                    }else{
                        s.push(k);
                    }
                    
                    board[j][moves[i]-1] = 0;    
                    
                    break;
                }
                
            }
        }
        
        return answer;
    }
}