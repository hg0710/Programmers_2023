import java.util.*;
public class Solution {
    public Stack solution(int []arr) {
        
        Stack s = new Stack();
        
        s.push(arr[0]);
        
        for(int i = 1 ; i < arr.length ; i++){
            s.push(arr[i]);
            
            if(arr[i] == arr[i-1]){
                s.pop();
            }
            
        }
        
        return s;
    }
}