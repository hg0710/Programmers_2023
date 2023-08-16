class Solution {
    public int solution(int n) {
        
        String s =new StringBuilder(Integer.toString(n,3)).reverse().toString();
        
        
        return Integer.parseInt(s,3);
    }
}