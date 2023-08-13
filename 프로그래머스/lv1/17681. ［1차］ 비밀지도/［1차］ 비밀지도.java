// class Solution {
//     public String[] solution(int n, int[] arr1, int[] arr2) {
        
//         String[] answer = new String[n];
        
//         for(int i =0 ; i < n ;i++){
            
//             StringBuilder sb = new StringBuilder();
            
//             String str1 = Integer.toBinaryString(arr1[i]);
//             String str2 = Integer.toBinaryString(arr2[i]);
            
//             if(str1.length() < n){
//                 str1 = "0".repeat(n - str1.length()) + str1;
//             }
//             if(str2.length() < n){
//                 str2 = "0".repeat(n - str2.length()) + str2;
//             }   
            
//             char[] c1 = str1.toCharArray();
//             char[] c2 = str2.toCharArray();
            
//             for(int j =0 ;j < n ;j++){
//                 if(c1[j] == '1' || c2[j] == '1'){
//                     sb.append("#");
//                 }else sb.append(" ");
//             }        
//             answer[i] = sb.toString();
            
//         }
      
//         return answer;
//     }
// }
class Solution {
  public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for (int i = 0; i < n; i++) {
            result[i] = String.format("%" + n + "s", result[i]);
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");
        }

        return result;
    }
}