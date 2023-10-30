class Solution {
    public int[] solution(String s) {
        
        int answer1 = 0;
        int answer2 = 0;

        while (!s.equals("1")) {
            
            int beforeLength = s.length();
            s = s.replace("0", "");
            int afterLength = s.length();
            
            answer2 += beforeLength - afterLength;
            answer1 ++;
            
            s = Integer.toBinaryString(afterLength);
        }

        return new int[]{answer1, answer2};
    }
}