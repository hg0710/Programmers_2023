import java.util.*;
class Solution {
    public List<Integer> solution(String today, String[] terms, String[] privacies) {
        
        String[] now = today.split("[.]");
        int[] nowInt = new int[now.length]; 

            for (int k = 0; k < now.length; k++) {
                nowInt[k] = Integer.parseInt(now[k]); 
            }
        List<Integer> answer = new ArrayList<>();
        
        Map<String, String> termsMap = new HashMap<String, String>();
        
        for(int j = 0 ; j<terms.length ;j++){
            String[] term = terms[j].split(" ");
            termsMap.put(term[0],term[1]);
        }
            
        for(int i =0 ; i<privacies.length ;i++){
            String[] privacy = privacies[i].split(" ");
            
            int month = Integer.parseInt(termsMap.get(privacy[1]));
            
            String[] day  = privacy[0].split("[.]");
            int[] dayInt = new int[day.length]; 

            for (int k = 0; k < day.length; k++) {
                dayInt[k] = Integer.parseInt(day[k]); 
            }
            
            dayInt[2] += month * 28;
            
            if(dayInt[2] > 28 ){
                dayInt[1] += dayInt[2]/28;
                dayInt[2] %= 28;               
            }
            System.out.println(dayInt[2]);
            
            if(dayInt[1] > 12){
                dayInt[0] += dayInt[1]/12;
                dayInt[1] %= 12;             
            }
            if(dayInt[1] ==0){
                dayInt[1] =12;
                dayInt[0] -=1;
            }

            
            if(nowInt[0] > dayInt[0]){
                answer.add(i+1);
            }else if(nowInt[0] == dayInt[0]){
                if(nowInt[1] > dayInt[1]){
                    answer.add(i+1);
                }else if(nowInt[1] == dayInt[1]){
                    if(nowInt[2] >= dayInt[2]){
                         answer.add(i+1);
                    }
                }
            }
            
        }
        
       
        return answer;
    }
}