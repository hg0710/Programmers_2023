import java.util.stream.Stream;

class Solution {
    public String solution(String s) {
       
        String[] str =s.split(" ");  
       int[] intArr = Stream.of(str).mapToInt(Integer::parseInt).sorted().toArray();
        
        return ""+ intArr[0] + " " + intArr[intArr.length-1];
    }
}