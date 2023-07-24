import java.util.stream.LongStream;
class Solution {
    public long solution(int a, int b) {
        
        if(a < b) return LongStream.rangeClosed(a,b).sum();
        else return LongStream.rangeClosed(b,a).sum();
    }
}