import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {

        Arrays.sort(strings, (a, b) -> {
            char charA = a.charAt(n);
            char charB = b.charAt(n);
            
            if (charA == charB) {
                return a.compareTo(b);
            } else {
                return Character.compare(charA, charB);
            }
        });

        return strings;
    }
}