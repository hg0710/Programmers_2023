class Solution {
    public int solution(int n) {
        int answer = n+1;
        
        String binaryN = Integer.toBinaryString(n);
        
        int nLengthBefore = binaryN.length();
        int nLengthAfter = binaryN.replace("1","").length();
        
        int nLength = nLengthBefore - nLengthAfter;
        
        while ( true ) {
            if ( answer > n ) {
                String binaryAnswer = Integer.toBinaryString(answer);
                
                int answerLengthBefore = binaryAnswer.length();
                int answerLengthAfter = binaryAnswer.replace("1","").length();
                
                int answerLength = answerLengthBefore - answerLengthAfter;
                
                if ( nLength == answerLength ) {
                    break;
                }
            }
            
            answer++; 
        }
        
        return answer;
    }
}