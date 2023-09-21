import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        
       List<String> strList = new ArrayList<>(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"));
        
        String[] ss = s.split("");
        String[] skips = skip.split("");
        
        for(int i =0; i<skips.length ;i++){
            strList.remove(String.valueOf(skips[i]));
        }
       
        List<String> list = new ArrayList<String>();
        int num =0;
        
        for(int i =0 ; i<ss.length ; i++){
            num = strList.indexOf(String.valueOf(ss[i])) + index;
            
            
            if(num >= strList.size()){
                num %= strList.size();
            }
            
            list.add(strList.get(num));
        }

        return String.join("",list);
    }
}