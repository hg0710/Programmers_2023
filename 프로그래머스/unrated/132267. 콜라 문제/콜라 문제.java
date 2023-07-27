public class Solution {
    public int solution(int a, int b, int n) {
        return function(a, b, n, 0);
    }

    public int function(int a, int b, int n, int total) {
        
        if (n<a) return total;

        
        int full = (n / a) * b;               
        total += full;
        
        if(n % a != 0) full += n % a;

        return function(a, b, full, total);
    }
}