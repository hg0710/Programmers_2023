class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int sum =0;
        int[] month = {0,31,29,31,30,31,30,31,31,30,31,30,31};        
        
        for(int i = 0; i < a ; i++){
            sum += month[i];        
        }

        sum = (sum + b -1) % 7;

        
        if(sum == 1){ answer ="SAT";}
        else if(sum ==2){answer ="SUN";}
        else if(sum ==3){answer ="MON";}
        else if(sum ==4){answer ="TUE";}
        else if(sum ==5){answer ="WED";}
        else if(sum ==6){answer ="THU";}
        else {answer ="FRI";}
        
        
        return answer;
    }
}