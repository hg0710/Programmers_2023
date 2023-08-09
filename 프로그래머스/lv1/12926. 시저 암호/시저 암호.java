class Solution {
    public String solution(String s, int n) {
       
        char[] c =s.toCharArray();
        
        for(int i = 0; i < c.length ; i++){
            if(!Character.isWhitespace(c[i])){
                if(c[i]>=65 && c[i]<=90){
                    if(c[i] + n >90){
                        c[i] += n-26;
                    }else{
                        c[i] += n;
                    }
                }
                if(c[i]>=97){
                    if(c[i] + n > 122){
                        c[i] += n -26;
                    }else{
                        c[i] += n;
                    }
                }
            }
        }
        
        String answer = new String(c);
        
        return answer;
    }
}