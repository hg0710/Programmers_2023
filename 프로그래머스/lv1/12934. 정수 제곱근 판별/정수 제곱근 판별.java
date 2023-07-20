import java.lang.Math.*;

class Solution {
    public double solution(long n) {
   
        double x = Math.sqrt(n);
        
        if(x % 1 == 0.0) return (long)((x+1) * (x+1));
        else return -1;

    }
}