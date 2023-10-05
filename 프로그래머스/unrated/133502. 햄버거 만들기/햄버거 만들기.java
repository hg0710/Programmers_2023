// import java.util.*;
// class Solution {
//     public int solution(int[] ingredient) {
//         int answer =0;
        
//         List<Integer> list = new ArrayList<>();
        
//         for (int i : ingredient) {
//             list.add(i);
//         }
//         int j =0;
        
//         while(j<list.size()-2){
            
//             if(list.get(j)==1 && list.get(j+1)==2 && list.get(j+2)==3 && list.get(j+3)==1){
//                 list.remove(j);
//                 list.remove(j);
//                 list.remove(j);
//                 list.remove(j);
//                 answer++;
//                 j=-1;
//             }
//             j++;
//         }
        
        
//         return answer;
//     }
// }
// 시간초과 : list.remove() 는 O(N) 시간복잡도를 가진다.
import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer =0;
        Stack<Integer> s = new Stack<Integer>();
        
        for(int i =0; i<ingredient.length ;i++){
            s.push(ingredient[i]);
            
            if(s.peek()==1 && s.size() > 3){
                if(s.get(s.size()-1)==1 && s.get(s.size()-2)==3 && s.get(s.size()-3)==2 && s.get(s.size()-4)==1){
                    s.pop();
                    s.pop();
                    s.pop();
                    s.pop();
                    
                    answer++;
                }
            }
        }
        
        return answer;
    }
}