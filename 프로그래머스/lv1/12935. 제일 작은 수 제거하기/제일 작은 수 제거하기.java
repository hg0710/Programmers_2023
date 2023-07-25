import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr) {
       
       if(arr.length == 1) return new int[] {-1};

    int min = IntStream.of(arr).min().getAsInt();
    return IntStream.of(arr).filter(i -> i != min).toArray();
    }
}