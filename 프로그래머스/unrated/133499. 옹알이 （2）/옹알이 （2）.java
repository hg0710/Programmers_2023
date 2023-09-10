import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        String[] answer = new String[babbling.length];
        int a = 0;
        
        for(int i = 0 ; i<babbling.length ; i++){
            int count = 0;
            
            answer[i] = babbling[i].replace("aya","1").replace("ye","2").replace("woo","3").replace("ma","4");
            
            
            char[] c = answer[i].toCharArray();
            
            for(int j =0 ; j<c.length; j++){
                if(Character.isDigit(c[j])){
                    count++;
                    
                    if(j<c.length-1 && c[j]==c[j+1]){
                        count--;
                    }
                    System.out.println("count : "+count);
                }
            }
           if(count==c.length){
               a++;
           }
            
            System.out.println(answer[i]);
        }
        
        
        
        
        return a;
    }
}