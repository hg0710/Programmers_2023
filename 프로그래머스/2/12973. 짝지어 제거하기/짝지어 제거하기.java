// class Solution
// {
//     public int solution(String s) {  
        
//         for ( char c = 'a'; c < 'z' ; c++ ) {            
//             s = s.replaceAll( c + "{2}","");
//         }              
        
//         if ( s.length() == 0 ) return 1;

//         return 0;
//     }
// }
// 문자열길이초과
import java.util.Stack;

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop(); 
            } else {
                stack.push(c); 
            }
        }
        
        if (stack.isEmpty()) {
            return 1; 
        } else {
            return 0; 
        }
    }
}

