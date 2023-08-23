import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new LinkedList<>();
        
        for(String card1 : cards1){
            q1.offer(card1);
        }
        for(String card2 : cards2){
            q2.offer(card2);
        }
        
        for(int i =0 ; i<goal.length ;i++){
            if(goal[i].equals(q1.peek())){
                q1.poll();
            }else if(goal[i].equals(q2.peek())){
                q2.poll();
            }else{
                return "No";
            }
        }
        
        
        return "Yes";
    }
}