class Solution {
    public String solution(String s) {     
        
        
        String[] str = s.split(" ", -1);
        
        for(int i =0 ; i< str.length ; i++){
            char[] c = str[i].toCharArray();
            
            for(int j =0 ; j < c.length ;j++){
                if(j ==0 || j % 2 ==0){
                    c[j] = Character.toUpperCase(c[j]);
                }else c[j] = Character.toLowerCase(c[j]);
            }
            str[i] = new String(c);
        }
        
        
        return String.join(" ", str);
    }
}