class Solution {
    public String solution(String s) {
        
        StringBuilder stb = new StringBuilder();        
        char[] c = s.toCharArray();
        stb.append(Character.toUpperCase(c[0]));
        
        for(int i =1 ; i < c.length ; i++){
            if(Character.isWhitespace(c[i])){
                stb.append(c[i]);
            }else{
                    if(Character.isWhitespace(c[i-1])){
                        stb.append(Character.toUpperCase(c[i]));
                    }else{
                       stb.append(Character.toLowerCase(c[i]));
                    }   
                }
            }
        return stb.toString();
        }
}
// 런타임 에러

// class Solution {
//     public String solution(String s) {
        
//         String[] str = s.split(" ");
        
//        for (int i = 0; i < str.length; i++) {
//             str[i] = Character.toUpperCase(str[i].charAt(0)) + str[i].substring(1).toLowerCase();
//         }
        
//         return String.join(" ",str);
//     }
// }



