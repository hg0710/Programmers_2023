import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Comparator;


class Solution {
    public long solution(long n) {
        
        String[] arr = String.valueOf(n).split("");
        
        Arrays.sort(arr, Comparator.reverseOrder());
                                                                         
        long num =0;
        
        for(String i : arr){
             num *= 10;
            num += Long.parseLong(i);
        }
        
        return num;
    }
}