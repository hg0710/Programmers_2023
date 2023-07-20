import java.util.stream.LongStream;
import java.util.Arrays;

class Solution {
    public long[] solution(int x, int n) {
        
        LongStream longstream = LongStream.rangeClosed(1, n)
            .map(i -> (long) x * i);
           
        return longstream.toArray();
    }
}
