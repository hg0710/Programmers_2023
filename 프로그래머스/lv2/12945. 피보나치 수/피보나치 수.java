import java.util.ArrayList;
class Solution {
    public int solution(int n) {
         
        ArrayList<Integer> f = new ArrayList<>();

        f.add(0);
        f.add(1);
        
        for(int i = 2; i <= n ; i++){
            f.add((f.get(i-1) + f.get(i-2)) % 1234567);
        }
        
        
        return f.get(n);
    }
}