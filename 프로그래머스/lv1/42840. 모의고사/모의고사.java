import java.util.*;
class Solution {
    public List<Integer> solution(int[] answers) {

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();
        
        int[] answer = new int[3];
        // 12345
        for(int i =0 ; i<answers.length ;i++){
            if(i % 5 == 0){
                l1.add(1);
            }else if(i % 5 == 1){
                l1.add(2);
            }else if(i % 5 == 2){
                l1.add(3);
            }else if(i % 5 == 3){
                l1.add(4);
            }else if(i % 5 == 4){
                l1.add(5);
            }
        }

        // 21232425
        for(int i =0 ; i<answers.length ;i++){
            if(i % 8 == 0){
                l2.add(2);
            }else if(i % 8 == 1){
                l2.add(1);
            }else if(i % 8 == 2){
                l2.add(2);
            }else if(i % 8 == 3){
                l2.add(3);
            }else if(i % 8 == 4){
                l2.add(2);
            }else if(i % 8 == 5){
                l2.add(4);
            }else if(i % 8 == 6){
                l2.add(2);
            }else if(i % 8 == 7){
                l2.add(5);
            }            
        }

         // 3311224455
         for(int i =0 ; i<answers.length ;i++){
            if(i % 10 == 0){
                l3.add(3);
            }else if(i % 10 == 1){
                l3.add(3);
            }else if(i % 10 == 2){
                l3.add(1);
            }else if(i % 10 == 3){
                l3.add(1);
            }else if(i % 10 == 4){
                l3.add(2);
            }else if(i % 10 == 5){
                l3.add(2);
            }else if(i % 10 == 6){
                l3.add(4);
            }else if(i % 10 == 7){
                l3.add(4);
            }else if(i % 10 == 8){
                l3.add(5);
            }else if(i % 10 == 9){
                l3.add(5);
            }           
        }
        
        for(int i =0 ; i< answers.length ;i++){
            if(answers[i]==l1.get(i)){
                answer[0]++;
            }
            if(answers[i]==l2.get(i)){
                answer[1]++;
            }
            if(answers[i]==l3.get(i)){
                answer[2]++;
            }
        }

        int max = Math.max(answer[0], Math.max(answer[1], answer[2]));
        List<Integer> answerList = new ArrayList<>();
       
        for(int i =0 ; i< 3 ;i++){
            if(answer[i]==max){
                answerList.add(i+1);
            }
        }
            
        return answerList;
    }
}