import java.util.*;
class Solution {
    public int solution(String dartResult) {
       
        
        char[] c  = dartResult.toCharArray();
        List<Integer> list = new ArrayList<Integer>();
        
              for(int i = 0 ; i< c.length ; i++){
                  if(Character.isDigit(c[i])){
                      int num = c[i]-'0';
                      
                      if(c[i+1] == '0'){
                          num = 10;
                      }
                      
                      list.add(num);
                      if(i>0){
                          if(c[i-1] == '1' && num == 0){
                            list.remove(list.size()-1);
                          }
                      }                     
                  }
                  int lastIndex = list.size()-1;
                  
                  
                  if(c[i]=='D'){
                       list.set(lastIndex, list.get(lastIndex) * list.get(lastIndex));
                  }else if(c[i]=='T'){
                      list.set(lastIndex, list.get(lastIndex) * list.get(lastIndex) * list.get(lastIndex));
                  }
                  
                  if(c[i]=='#'){
                      list.set(lastIndex, list.get(lastIndex) * (-1));
                  }else if(c[i]=='*'){
                      list.set(lastIndex, list.get(lastIndex) * 2);
                      
                      if(list.size()>=2){
                          int notLastIndex = list.size()-2;
                          list.set(notLastIndex, list.get(notLastIndex) * 2);
                      }
                  }
              }
        int sum =0;
        
        for(int i =0;i<list.size() ; i++){
            sum += list.get(i);
        }
        
        
        return sum;
    }
}
