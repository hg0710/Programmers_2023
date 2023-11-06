class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int width =0;
        int length =0;
        
        for ( int i = 1 ; i < yellow ; i++ ) {
            if ( yellow % i == 0 && (brown+yellow) % (i+2) == 0 &&  brown == ( i * 2 ) + 4 + (yellow/i) * 2 ) {                         
                width =i;
                length = yellow / width;
            }
        }
        
        if (length ==0 && width ==0 ) {
            width=1;
            length=1;
        }
        
        answer[0] = Math.max(width+2,length+2);
        answer[1] = Math.min(width+2,length+2);

        
        return answer;
    }
}