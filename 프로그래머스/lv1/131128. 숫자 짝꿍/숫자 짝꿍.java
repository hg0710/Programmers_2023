// import java.util.*;
// class Solution {
//     public String solution(String X, String Y) {
        
//         String[] x = X.split("");
//         String y = Y;
//         List<String> list = new ArrayList<String>();
        
//         for(int i = 0 ; i<x.length ; i++){
//                 if(y.contains(x[i])){
//                     list.add(x[i]);
                    
//                     y = y.replaceFirst(x[i], "");
//                 }
//         }
        
//         if(list.size()==0){
//             return "-1";
//         }else if(list.get(0).equals("0")){
//             return "0";
//         }
        
//         Collections.sort(list,Collections.reverseOrder());
        
        
        
//         return String.join("",list);
//     }
// }

import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        int[] countX = new int[10];
        int[] countY = new int[10];

        // Count the frequency of each digit in X and Y
        for (char c : X.toCharArray()) {
            int digit = c - '0';
            countX[digit]++;
        }
        for (char c : Y.toCharArray()) {
            int digit = c - '0';
            countY[digit]++;
        }

        StringBuilder result = new StringBuilder();

        // Find the common digits and build the result
        for (int i = 9; i >= 0; i--) {
            int commonCount = Math.min(countX[i], countY[i]);
            for (int j = 0; j < commonCount; j++) {
                result.append(i);
            }
        }

        if (result.length() == 0) {
            return "-1";
        } else if (result.charAt(0) == '0') {
            return "0";
        }

        return result.toString();
    }
}
