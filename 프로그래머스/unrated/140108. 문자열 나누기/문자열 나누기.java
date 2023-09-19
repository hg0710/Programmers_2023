// class Solution {
//     public int solution(String s) {
//         int answer = 0;
        
//         String[] str = s.split("");
        
//         int firstCount =1;
//         int nextCount =0;
        
//         for(int i =0; i<str.length-1 ;i++){
//             if(str[i].equals(str[i+1])){
                
//                 if(nextCount == 0){
//                     firstCount++;
//                     System.out.println("firstCount = "+ firstCount +"index= "+ i);
//                 }else{
//                     nextCount++;
//                     System.out.println("nextCount = "+ nextCount +"index= "+ i);
//                 }

//             }else{
//                 if(nextCount!=0){
//                     nextCount=0;
//                 }
//                 nextCount++;
//                 System.out.println("nextCount = "+ nextCount +"index= "+ i);
                
//             }
//             if(firstCount == nextCount){
//                     answer++;
//                     firstCount=1;
//                     nextCount=0;
//                     i++;
                
//                 System.out.println("answer = "+ answer +"index= "+ i);
//                 }
            
//             if(i==str.length-2){
//                 answer++;
//             }
//         }
        
//         return answer;
//     }
// }
//테케 23점
class Solution {
    public int solution(String s) {
        int answer = 0; // 분해한 문자열의 개수를 저장하는 변수
        int startIndex = 0; // 분해 시작 인덱스를 저장하는 변수

        while (startIndex < s.length()) {
            char x = s.charAt(startIndex); // 현재 문자열의 첫 글자를 x로 선택
            int firstCount = 0; // x로 시작하는 문자열의 길이를 저장하는 변수
            int nextCount = 0; // 다음 문자로 시작하는 문자열의 길이를 저장하는 변수
            int currentIndex = startIndex; // 현재 인덱스를 저장하는 변수

            while (currentIndex < s.length()) {
                char currentChar = s.charAt(currentIndex);

                if (currentChar == x) {
                    firstCount++;
                } else {
                    nextCount++;
                }

                if (firstCount == nextCount) {
                    answer++;
                    startIndex = currentIndex + 1; // 다음 분해 시작 인덱스 설정
                    break;
                }

                currentIndex++;
            }

            if (currentIndex == s.length()) {
                answer++;
                break;
            }
        }

        return answer;
    }
}